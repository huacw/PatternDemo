package com.sea.pattern.builder;

/**
 * 
 * 人员创建者
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class PersonBuilder {
	public abstract void createHead();

	public abstract void createBody();

	public abstract void createArm();

	public abstract void createLeg();
}
