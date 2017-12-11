package com.sea.pattern.template.hook;

/**
 * 
 * 饮料类，带钩子（hook）类
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class Beverage {
	/**
	 * 冲泡咖啡或茶...流程
	 */
	public final void create() {
		boilWater();// 把水煮沸
		brew();// 用沸水冲泡...
		pourInCup();// 把...倒进杯子
		addCoundiments();// 加...

		hook();// 钩子方法
	}

	// 空实现方法
	public void hook() {
	}

	public abstract void addCoundiments();

	public abstract void brew();

	public void boilWater() {
		System.out.println("煮开水");
	}

	public void pourInCup() {
		System.out.println("倒进杯子");
	}
}
