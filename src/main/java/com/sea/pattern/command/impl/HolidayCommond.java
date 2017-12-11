package com.sea.pattern.command.impl;

import com.sea.pattern.command.Command;
import com.sea.pattern.command.Receiver;

/**
 * 
 * æﬂÃÂ√¸¡Ó
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class HolidayCommond implements Command {
	private Receiver receiver;

	public HolidayCommond(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		if (receiver != null) {
			receiver.doAction();
			System.out.println("–›ºŸ°≠°≠");
		}
	}

}
