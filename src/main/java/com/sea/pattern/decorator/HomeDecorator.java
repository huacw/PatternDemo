package com.sea.pattern.decorator;

/**
 * 
 * �Ҿ�װ��
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
		System.out.println("�����Ҿӷ�װ");
	}

	@Override
	public void walkToWhere() {
		super.walkToWhere();
		System.out.println("ȥ�鷿����");
	}
}
