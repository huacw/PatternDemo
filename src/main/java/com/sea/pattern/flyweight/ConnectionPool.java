package com.sea.pattern.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 连接池(享元工厂)，享元模式包括享元工厂、享元对象接口以及享元具体对象
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class ConnectionPool {
	private List<Connection> pool = null;
	/* 公有属性 */
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

	/* 构造方法，做一些初始化工作 */
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

	/* 返回连接到连接池 */
	public synchronized void release() {
		pool.add(conn);
	}

	/* 返回连接池中的一个数据库连接 */
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
