package com.sea.pattern.template.hook.tap;

public class Main {

	public static void main(String[] args) {
		Beverage beverage = new Coffice();
		beverage.create();
		System.out.println();
		beverage = new Tea();
		beverage.create();
	}

}
