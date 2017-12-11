package com.sea.pattern.adapter.object;

public class Main {

	public static void main(String[] args) {
		Wrapper adapter = new Wrapper(new Source());
		adapter.print();
		adapter.println();
	}

}
