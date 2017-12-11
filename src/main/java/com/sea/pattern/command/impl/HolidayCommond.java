package com.sea.pattern.command.impl;

import com.sea.pattern.command.Command;
import com.sea.pattern.command.Receiver;

/**
 * 
 * ��������
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
			System.out.println("�ݼ١���");
		}
	}

}
