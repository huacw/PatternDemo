package com.sea.pattern.state;

import com.sea.pattern.state.impl.GoodState;

public class Main {

	public static void main(String[] args) {
		Context context = new Context(new GoodState());
		context.next();
		context.next();
		context.setFinished(true);
		context.next();
	}

}
