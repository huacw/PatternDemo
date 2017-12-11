package com.sea.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Decorator decorator = new CookedDecorator(new HomeDecorator(
				new Person()));
		decorator.wearClothes();
		decorator.walkToWhere();
	}
}
