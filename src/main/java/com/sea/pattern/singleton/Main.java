package com.sea.pattern.singleton;

public class Main {

	public static void main(String[] args) {
		Singleton instance = Singleton.newInstance();
		System.out.println(instance);
		Singleton instance1 = Singleton.newInstance();
		System.out.println(instance1 == instance);
	}

}
