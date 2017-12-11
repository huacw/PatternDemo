package com.sea.pattern.factory.factorymethod;

import com.sea.pattern.factory.simplefactory.Operation;

/**
 * 
 * 工厂接口
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface IFactory {
	public Operation createOperation();
}
