package com.sea.pattern.state.impl;

import com.sea.pattern.state.Context;
import com.sea.pattern.state.State;

/**
 * 
 * »µ×´Ì¬
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
			System.out.println("½áÊø¡­¡­");
		} else {
			System.out.println("×´Ì¬Ôã¸â");
			context.setState(new GoodState());
		}
	}

}
