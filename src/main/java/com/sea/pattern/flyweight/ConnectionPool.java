package com.sea.pattern.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ���ӳ�(��Ԫ����)����Ԫģʽ������Ԫ��������Ԫ����ӿ��Լ���Ԫ�������
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class ConnectionPool {
	private List<Connection> pool = null;
	/* �������� */
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";

	private static int poolSize = 100;
	private static ConnectionPool instance = null;
	Connection conn = null;

	public synchronized static ConnectionPool newInstance(int initSize) {
		if (instance == null) {
			poolSize = initSize;
			instance = new ConnectionPool();
		}
		return instance;
	}

	/* ���췽������һЩ��ʼ������ */
	private ConnectionPool() {
		pool = new ArrayList<Connection>(poolSize);

		for (int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverClassName);
				Connection conn = DriverManager.getConnection(url, username,
						password);
				pool.add(conn);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public int getAvailableConnectionSize() {
		return pool.size();
	}

	/* �������ӵ����ӳ� */
	public synchronized void release() {
		pool.add(conn);
	}

	/* �������ӳ��е�һ�����ݿ����� */
	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			conn = pool.get(0);
			pool.remove(conn);
			return conn;
		} else {
			return null;
		}
	}

}
