package com.sea.pattern.proxy;

/**
 * 
 * ��������
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class RealSubject implements Subject {

	@Override
	public void operate() {
		System.out.println("realsubject operatestarted......");
	}

}
