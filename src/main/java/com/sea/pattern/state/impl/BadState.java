package com.sea.pattern.state.impl;

import com.sea.pattern.state.Context;
import com.sea.pattern.state.State;

/**
 * 
 * ��״̬
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class BadState implements State {

	@Override
	public void handle(Context context) {
		if (context == null) {
			return;
		}
		if (context.isFinished()) {
			System.out.println("��������");
		} else {
			System.out.println("״̬���");
			context.setState(new GoodState());
		}
	}

}
