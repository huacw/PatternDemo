package com.sea.pattern.template;

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

}
