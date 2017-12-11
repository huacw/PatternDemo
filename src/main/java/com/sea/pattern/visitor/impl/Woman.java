package com.sea.pattern.visitor.impl;

import com.sea.pattern.visitor.Person;
import com.sea.pattern.visitor.Status;

/**
 * 
 * ≈Æ»À
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Woman implements Person {

	@Override
	public void appcet(Status status) {
		status.getWomanStatus(this);
	}

}
