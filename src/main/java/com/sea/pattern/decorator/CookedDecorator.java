package com.sea.pattern.decorator;

/**
 * 
 * 做饭装饰
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class CookedDecorator extends Decorator {

	public CookedDecorator(Human human) {
		super(human);
	}

	@Override
	public void wearClothes() {
		super.wearClothes();
		System.out.println("更换围裙");
	}

	@Override
	public void walkToWhere() {
		super.walkToWhere();
		System.out.println("去厨房做饭");
	}
}
