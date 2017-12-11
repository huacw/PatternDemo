package com.sea.pattern.adapter.inf;

/**
 * 
 * 带回车的打印
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class PrintWithEnter extends Wrapper {

	@Override
	public void println() {
		System.out.println("回车打印");
	}

}
