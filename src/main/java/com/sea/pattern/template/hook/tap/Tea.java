package com.sea.pattern.template.hook.tap;

/**
 * 
 * ����
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Tea extends Beverage {

	@Override
	public void addCoundiments() {
		System.out.println("��ӷ���");
	}

	@Override
	public void brew() {
		System.out.println("��ˮ���");
	}

	@Override
	public boolean hook() {
		return false;
	}

}
