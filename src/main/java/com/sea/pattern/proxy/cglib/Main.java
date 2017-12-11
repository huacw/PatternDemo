package com.sea.pattern.proxy.cglib;

public class Main {

	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		// 通过生成子类的方式创建代理类
//		Subject proxyImp = (Subject) proxy.getProxy(Subject.class);
		Subject proxyImp = proxy.newInstance(Subject.class);
		proxyImp.print();
		proxyImp.test();
	}

}
