package com.sea.pattern.proxy;

/**
 * 
 * 具体主题
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class RealSubject implements Subject {

	@Override
	public void operate() {
		System.out.println("realsubject operatestarted......");
	}

}
