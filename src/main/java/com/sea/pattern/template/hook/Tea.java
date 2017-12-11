package com.sea.pattern.template.hook;

/**
 * 
 * 茶类
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Tea extends Beverage {

	@Override
	public void addCoundiments() {
		System.out.println("添加蜂蜜");
	}

	@Override
	public void brew() {
		System.out.println("用水冲茶");
	}

	@Override
	public void hook() {
		System.out.println("清洗茶具");
	}

}
