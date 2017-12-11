package com.sea.pattern.mediator.impl;

import com.sea.pattern.mediator.Country;
import com.sea.pattern.mediator.UnitedNations;

/**
 * 
 * ����
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class USA extends Country {

	public USA(UnitedNations un) {
		super(un);
	}

	public void declare(String message) {
		if (mediator != null) {
			mediator.declare(message, this);
		}
	}

	public void getMessage(String message) {
		System.out.println("������ȡ����Ϣ��" + message);
	}
}