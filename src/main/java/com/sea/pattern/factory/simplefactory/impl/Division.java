package com.sea.pattern.factory.simplefactory.impl;

import com.sea.pattern.factory.simplefactory.Operation;

/**
 * 
 * ����
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Division extends Operation {

	@Override
	public double operate() {
		return numA / numB;
	}

}
