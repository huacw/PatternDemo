package com.sea.pattern.proxy.dynamic;

public class Main {

	public static void main(String[] args) {
		BusinessFoo bf = (BusinessFoo) BusinessImplProxy
				.factory(new BusinessFooImpl());
		bf.foo();
		System.out.println(bf);
	}

}