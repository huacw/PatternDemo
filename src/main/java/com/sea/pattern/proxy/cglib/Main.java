package com.sea.pattern.proxy.cglib;

public class Main {

	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		// ͨ����������ķ�ʽ����������
//		Subject proxyImp = (Subject) proxy.getProxy(Subject.class);
		Subject proxyImp = proxy.newInstance(Subject.class);
		proxyImp.print();
		proxyImp.test();
	}

}
