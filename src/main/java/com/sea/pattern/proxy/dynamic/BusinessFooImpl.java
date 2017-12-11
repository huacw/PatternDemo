package com.sea.pattern.proxy.dynamic;

/**
 * 
 * 真实角色：真正实现业务逻辑方法  
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class BusinessFooImpl implements BusinessFoo {

	@Override
	public void foo() {
		System.out.println("BusinessFooImpl.foo()");
	}
}
