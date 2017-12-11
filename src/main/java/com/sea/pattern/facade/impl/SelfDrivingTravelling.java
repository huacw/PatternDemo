package com.sea.pattern.facade.impl;

import com.sea.pattern.facade.ITravel;

/**
 * 
 * 自驾游
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class SelfDrivingTravelling implements ITravel {

	@Override
	public void travel() {
		System.out.println("检查汽车状况");
		System.out.println("给汽车加油");
		System.out.println("开车向目的地出发");
	}

}
