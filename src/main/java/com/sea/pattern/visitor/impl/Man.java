package com.sea.pattern.visitor.impl;

import com.sea.pattern.visitor.Person;
import com.sea.pattern.visitor.Status;

/**
 * 
 * ÄĞÈË
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Man implements Person {

	@Override
	public void appcet(Status status) {
		status.getManStatus(this);
	}

}
