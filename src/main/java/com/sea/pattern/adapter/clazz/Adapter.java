package com.sea.pattern.adapter.clazz;

/**
 * 
 * 类适配器
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void println() {
		System.out.println("目标类打印");
	}

}
