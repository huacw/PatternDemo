package com.sea.pattern.decorator;

/**
 * ���屻װ���ߣ���װ���߳�ʼ״̬��Щ�Լ���װ��
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Person implements Human {

	@Override
	public void wearClothes() {
		System.out.println("��ʲô�ء���");
	}

	@Override
	public void walkToWhere() {
		System.out.println("ȥ�����ء���");
	}

}
