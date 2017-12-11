package com.sea.pattern.factory.factorymethod.impl;

import com.sea.pattern.factory.factorymethod.IFactory;
import com.sea.pattern.factory.simplefactory.Operation;
import com.sea.pattern.factory.simplefactory.impl.Additive;

/**
 * 
 * 加法工厂
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class AdditiveFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new Additive();
	}

}
