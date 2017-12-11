package com.sea.pattern.factory.simplefactory;

import com.sea.pattern.factory.simplefactory.impl.Additive;
import com.sea.pattern.factory.simplefactory.impl.Division;
import com.sea.pattern.factory.simplefactory.impl.Multiplication;
import com.sea.pattern.factory.simplefactory.impl.Subtraction;

/**
 * 
 * π§≥ß¿‡
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class OperationFactory {
	public static Operation createOperation(String op) {
		Operation operation = null;
		if ("+".equals(op)) {
			operation = new Additive();
		} else if ("-".equals(op)) {
			operation = new Subtraction();
		} else if ("*".equals(op)) {
			operation = new Multiplication();
		} else if ("/".equals(op)) {
			operation = new Division();
		}
		return operation;
	}
}
