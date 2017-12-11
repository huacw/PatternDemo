package com.sea.pattern.builder.impl;

import com.sea.pattern.builder.PersonBuilder;

/**
 * 
 * ÅÖÈË
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class FatPerson extends PersonBuilder {

	@Override
	public void createHead() {
		System.out.println("¶Ì·¢");
	}

	@Override
	public void createBody() {
		System.out.println("Éí²Ä·ÊÅÖ");
	}

	@Override
	public void createArm() {
		System.out.println("¶Ì±Û");
	}

	@Override
	public void createLeg() {
		System.out.println("¶ÌÍÈ");
	}

}
