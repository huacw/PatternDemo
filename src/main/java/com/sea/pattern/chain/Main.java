package com.sea.pattern.chain;

public class Main {

	public static void main(String[] args) {
		MangerHandler h1 = new MangerHandler("小组长");
		MangerHandler h2 = new MangerHandler("项目经理");
		MangerHandler h3 = new MangerHandler("总监");
		MangerHandler h4 = new MangerHandler("总经理");
		h1.setHandler(h2);
		h2.setHandler(h3);
		h3.setHandler(h4);
		
		h1.operator();
	}

}
