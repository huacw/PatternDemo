package com.sea.pattern.facade.impl;

import com.sea.pattern.facade.ITravel;

/**
 * 
 * �Լ���
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class SelfDrivingTravelling implements ITravel {

	@Override
	public void travel() {
		System.out.println("�������״��");
		System.out.println("����������");
		System.out.println("������Ŀ�ĵس���");
	}

}
