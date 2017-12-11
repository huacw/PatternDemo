package com.sea.pattern.command.impl;

import com.sea.pattern.command.Command;
import com.sea.pattern.command.Receiver;

/**
 * 
 * 具体命令
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class WorkCommond implements Command {
	private Receiver receiver;

	public WorkCommond(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		if (receiver != null) {
			receiver.doAction();
			System.out.println("工作……");
		}
	}

}
