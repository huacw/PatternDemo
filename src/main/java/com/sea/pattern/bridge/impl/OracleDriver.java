package com.sea.pattern.bridge.impl;

import com.sea.pattern.bridge.DBDriver;

/**
 * 
 * oracle���ݿ�����
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class OracleDriver implements DBDriver {

	@Override
	public void getConnection() {
		System.out.println("oracle���ݿ�����");
	}

}
