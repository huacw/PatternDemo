package com.sea.pattern.factory.abstractfactory.impl;

import com.sea.pattern.factory.abstractfactory.AbstractYellowHuman;

/**
 * 
 * ��������
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class MaleBlackHuman extends AbstractYellowHuman {

	@Override
	public void getSex() {
		System.out.println("��������");
	}

}
