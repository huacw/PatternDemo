package com.sea.pattern.factory.simplefactory.impl;

import com.sea.pattern.factory.simplefactory.Operation;

/**
 * 
 * ³Ë·¨
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Multiplication extends Operation {

	@Override
	public double operate() {
		return numA * numB;
	}

}
