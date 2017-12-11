package com.sea.pattern.factory.abstractfactory.impl;

import com.sea.pattern.factory.abstractfactory.AbstractYellowHuman;

/**
 * 
 * 黄人女性
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class FemaleYellowHuman extends AbstractYellowHuman {

	@Override
	public void getSex() {
		System.out.println("黄人女性");
	}

}
