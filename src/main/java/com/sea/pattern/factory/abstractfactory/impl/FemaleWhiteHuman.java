package com.sea.pattern.factory.abstractfactory.impl;

import com.sea.pattern.factory.abstractfactory.AbstractYellowHuman;

/**
 * 
 * ����Ů��
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class FemaleWhiteHuman extends AbstractYellowHuman {

	@Override
	public void getSex() {
		System.out.println("����Ů��");
	}

}
