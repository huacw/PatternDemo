package com.sea.pattern.proxy.cglib;

/**
 * 
 * 被代理类
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Subject {
	public void print() {
		System.out.println("打印方法……");
	}

	public void test() {
		System.out.println("测试方法……");
	}
}
