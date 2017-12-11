package com.sea.pattern.interpreter.impl;

import com.sea.pattern.interpreter.Context;
import com.sea.pattern.interpreter.Expression;

/**
 * 
 * ¼Ó
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Plus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getFirstNum() + context.getSecondNum();
	}

}
