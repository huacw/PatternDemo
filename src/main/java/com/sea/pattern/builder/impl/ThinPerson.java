package com.sea.pattern.builder.impl;

import com.sea.pattern.builder.PersonBuilder;

/**
 * 
 * 瘦人
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class ThinPerson extends PersonBuilder {

	@Override
	public void createHead() {
		System.out.println("长发");
	}

	@Override
	public void createBody() {
		System.out.println("身材消瘦");
	}

	@Override
	public void createArm() {
		System.out.println("长臂");
	}

	@Override
	public void createLeg() {
		System.out.println("短腿");
	}

}
