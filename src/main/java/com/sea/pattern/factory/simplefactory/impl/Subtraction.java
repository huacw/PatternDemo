package com.sea.pattern.factory.simplefactory.impl;

import com.sea.pattern.factory.simplefactory.Operation;

/**
 * 
 * ¼õ·¨
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Subtraction extends Operation {

	@Override
	public double operate() {
		return numA - numB;
	}

}
