package com.sea.pattern.decorator;

/**
 * 
 * ����װ����
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class Decorator implements Human {
	private Human human;

	public Decorator(Human human) {
		super();
		this.human = human;
	}

	@Override
	public void wearClothes() {
		human.wearClothes();
	}

	@Override
	public void walkToWhere() {
		human.walkToWhere();
	}
}
