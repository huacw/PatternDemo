package com.sea.pattern.template.hook;

/**
 * 
 * ������
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Coffice extends Beverage {

	@Override
	public void addCoundiments() {
		System.out.println("���ţ�̺���");
	}

	@Override
	public void brew() {
		System.out.println("��ˮ�忧��");
	}

}
