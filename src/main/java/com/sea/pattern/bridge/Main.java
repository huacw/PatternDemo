package com.sea.pattern.bridge;

import com.sea.pattern.bridge.impl.DB2Driver;
import com.sea.pattern.bridge.impl.DBDriverManager;
import com.sea.pattern.bridge.impl.OracleDriver;

public class Main {

	public static void main(String[] args) {
		IDBDriverManager dbDriverManger = new DBDriverManager(
				new OracleDriver());
		dbDriverManger.getConnection();

		IDBDriverManager dbDriverManger1 = new DBDriverManager(new DB2Driver());
		dbDriverManger1.getConnection();
	}

}
