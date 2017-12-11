package com.sea.pattern.builder.impl;

import com.sea.pattern.builder.PersonBuilder;

/**
 * 
 * ����
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class FatPerson extends PersonBuilder {

	@Override
	public void createHead() {
		System.out.println("�̷�");
	}

	@Override
	public void createBody() {
		System.out.println("��ķ���");
	}

	@Override
	public void createArm() {
		System.out.println("�̱�");
	}

	@Override
	public void createLeg() {
		System.out.println("����");
	}

}
