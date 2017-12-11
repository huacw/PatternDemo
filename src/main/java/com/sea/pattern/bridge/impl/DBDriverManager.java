package com.sea.pattern.bridge.impl;

import com.sea.pattern.bridge.DBDriver;
import com.sea.pattern.bridge.IDBDriverManager;

/**
 * 
 * 数据库驱动管理类
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class DBDriverManager implements IDBDriverManager {
	private DBDriver driver;

	public DBDriverManager(DBDriver driver) {
		super();
		this.driver = driver;
	}

	@Override
	public void getConnection() {
		if (driver != null) {
			driver.getConnection();
		}
	}

}
