package com.sea.pattern.factory.factorymethod;

import com.sea.pattern.factory.factorymethod.impl.AdditiveFactory;
import com.sea.pattern.factory.simplefactory.Operation;

public class Main {

	public static void main(String[] args) {
		IFactory factory = new AdditiveFactory();
		Operation operation = factory.createOperation();
		operation.setNumA(10);
		operation.setNumB(23.5);
		System.out.println(operation.operate());
	}

}
