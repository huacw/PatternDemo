package com.sea.pattern.decorator;

/**
 * 
 * ����װ��
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
		System.out.println("����Χȹ");
	}

	@Override
	public void walkToWhere() {
		super.walkToWhere();
		System.out.println("ȥ��������");
	}
}
