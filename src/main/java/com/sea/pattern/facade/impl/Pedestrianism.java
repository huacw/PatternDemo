package com.sea.pattern.facade.impl;

import com.sea.pattern.facade.ITravel;

/**
 * 
 * 徒步旅行
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Pedestrianism implements ITravel {

	@Override
	public void travel() {
		System.out.println("准备徒步工具");
		System.out.println("准备食物和水");
		System.out.println("徒步向目的地出发");
	}
	
}
