package com.sea.pattern.factory.abstractfactory;

/**
 * 
 * 黑色人种
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class AbstractBlackHuman implements Human {
	// 黑色人种的颜色是白色的
	public void getColor() {
		System.out.println("黑色人种的皮肤颜色是黑色的！"); 
	}

	// 黑色人种讲话
	public void talk() {
		System.out.println("黑人会说话，一般人听不懂。"); 
	}
}
