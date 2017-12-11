package com.sea.pattern.adapter.inf;

/**
 * 
 * 接口适配器
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class Wrapper implements Sourceable {
	@Override
	public void println() {
		System.out.println("适配器回车打印-----------");
	}

	@Override
	public void print() {
		System.out.println("适配器打印不回车-----------");
	}

}
