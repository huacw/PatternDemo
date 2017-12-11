package com.sea.pattern.interpreter;

import com.sea.pattern.interpreter.impl.Minus;
import com.sea.pattern.interpreter.impl.Plus;

public class Main {

	public static void main(String[] args) {
		int result = new Minus().interpret((new Context(new Plus()
				.interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}

}
