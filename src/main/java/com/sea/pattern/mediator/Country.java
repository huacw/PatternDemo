package com.sea.pattern.mediator;

/**
 * 
 * ¹ú¼Ò
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class Country {
	protected UnitedNations mediator;

	public Country(UnitedNations mediator) {
		super();
		this.mediator = mediator;
	}
}
