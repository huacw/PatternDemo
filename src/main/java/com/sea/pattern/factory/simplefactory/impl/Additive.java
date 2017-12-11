package com.sea.pattern.factory.simplefactory.impl;

import com.sea.pattern.factory.simplefactory.Operation;

/**
 * 
 * �ӷ�
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Additive extends Operation {

	@Override
	public double operate() {
		return numA + numB;
	}

}
