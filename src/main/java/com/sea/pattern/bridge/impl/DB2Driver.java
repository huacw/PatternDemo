package com.sea.pattern.bridge.impl;

import com.sea.pattern.bridge.DBDriver;

/**
 * 
 * DB2���ݿ�����
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class DB2Driver implements DBDriver {

	@Override
	public void getConnection() {
		System.out.println("DB2���ݿ�����");
	}

}
