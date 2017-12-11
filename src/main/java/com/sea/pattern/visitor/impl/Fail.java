package com.sea.pattern.visitor.impl;

import com.sea.pattern.visitor.Status;

/**
 * 
 * 失败
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Fail implements Status {

	@Override
	public void getManStatus(Man man) {
		System.out.println("男人失败时，闷头喝酒，谁也不用劝");
	}

	@Override
	public void getWomanStatus(Woman woman) {
		System.out.println("女人失败时，眼泪汪汪，谁也劝不了");
	}

}
