package com.sea.pattern.template;

/**
 * 
 * ������
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class Beverage {
	/**
	 * ���ݿ��Ȼ��...����
	 */
	public final void create() {
		boilWater();// ��ˮ���
		brew();// �÷�ˮ����...
		pourInCup();// ��...��������
		addCoundiments();// ��...
	}

	public abstract void addCoundiments();

	public abstract void brew();

	public void boilWater() {
		System.out.println("��ˮ");
	}

	public void pourInCup() {
		System.out.println("��������");
	}
}
