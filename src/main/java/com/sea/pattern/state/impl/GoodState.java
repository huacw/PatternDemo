package com.sea.pattern.state.impl;

import com.sea.pattern.state.Context;
import com.sea.pattern.state.State;

/**
 * 
 * 好状态
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class GoodState implements State {

	@Override
	public void handle(Context context) {
		if (context == null) {
			return;
		}
		if (context.isFinished()) {
			System.out.println("结束……");
		} else {
			System.out.println("状态棒极了");
			context.setState(new BadState());
		}
	}

}
