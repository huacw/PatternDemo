package com.sea.pattern.proxy.dynamic;

/**
 * 
 * ��ʵ��ɫ������ʵ��ҵ���߼�����  
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class BusinessFooImpl implements BusinessFoo {

	@Override
	public void foo() {
		System.out.println("BusinessFooImpl.foo()");
	}
}
