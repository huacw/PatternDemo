package com.sea.pattern.decorator;

/**
 * 
 * 家居装饰
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class HomeDecorator extends Decorator {
	public HomeDecorator(Human human) {
		super(human);
	}

	@Override
	public void wearClothes() {
		super.wearClothes();
		System.out.println("更换家居服装");
	}

	@Override
	public void walkToWhere() {
		super.walkToWhere();
		System.out.println("去书房看书");
	}
}
