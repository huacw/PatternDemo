package com.sea.pattern.template.hook;

/**
 * 
 * 咖啡类
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Coffice extends Beverage {

	@Override
	public void addCoundiments() {
		System.out.println("添加牛奶和糖");
	}

	@Override
	public void brew() {
		System.out.println("用水冲咖啡");
	}

}
