package com.sea.pattern.visitor.impl;

import com.sea.pattern.visitor.Status;

/**
 * 
 * 成功
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Success implements Status {

	@Override
	public void getManStatus(Man man) {
		System.out.println("男人成功时，背后多半有一个伟大的女人");
	}

	@Override
	public void getWomanStatus(Woman woman) {
		System.out.println("女人成功时，背后大多有一个不成功的男人");
	}

}
