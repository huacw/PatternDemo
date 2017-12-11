package com.sea.pattern.bridge.impl;

import com.sea.pattern.bridge.DBDriver;

/**
 * 
 * oracle数据库驱动
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class OracleDriver implements DBDriver {

	@Override
	public void getConnection() {
		System.out.println("oracle数据库驱动");
	}

}
