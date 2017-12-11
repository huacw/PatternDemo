package com.sea.pattern.factory.factorymethod.impl;

import com.sea.pattern.factory.factorymethod.IFactory;
import com.sea.pattern.factory.simplefactory.Operation;
import com.sea.pattern.factory.simplefactory.impl.Subtraction;

/**
 * 
 * ¼õ·¨¹¤³§
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class SubtractionFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new Subtraction();
	}

}
