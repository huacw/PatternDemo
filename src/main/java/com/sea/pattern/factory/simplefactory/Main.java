package com.sea.pattern.factory.simplefactory;

public class Main {

	public static void main(String[] args) {
		Operation op = OperationFactory.createOperation("+");
		op.setNumA(12);
		op.setNumB(34);
		System.out.println(op.operate());
	}

}
