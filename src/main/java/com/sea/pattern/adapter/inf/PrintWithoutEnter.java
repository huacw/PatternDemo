package com.sea.pattern.adapter.inf;

/**
 * 
 * 不带回车的打印
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class PrintWithoutEnter extends Wrapper {

	@Override
	public void print() {
		System.out.println("打印不回车");
	}

}
