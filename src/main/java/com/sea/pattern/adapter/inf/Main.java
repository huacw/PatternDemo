package com.sea.pattern.adapter.inf;

public class Main {

	public static void main(String[] args) {
		Sourceable source = new PrintWithEnter();
		source.print();
		source.println();

		Sourceable source1 = new PrintWithoutEnter();
		source1.print();
		source1.println();
	}

}
