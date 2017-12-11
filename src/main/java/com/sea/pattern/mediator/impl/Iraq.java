package com.sea.pattern.mediator.impl;

import com.sea.pattern.mediator.Country;
import com.sea.pattern.mediator.UnitedNations;

/**
 * 
 * 伊拉克
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Iraq extends Country {

	public Iraq(UnitedNations un) {
		super(un);
	}

	public void declare(String message) {
		if (mediator != null) {
			mediator.declare(message, this);
		}
	}

	public void getMessage(String message) {
		System.out.println("伊拉克获取的消息：" + message);
	}
}