package com.sea.pattern.template.hook;

/**
 * 
 * �����࣬�����ӣ�hook����
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

		hook();// ���ӷ���
	}

	// ��ʵ�ַ���
	public void hook() {
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
