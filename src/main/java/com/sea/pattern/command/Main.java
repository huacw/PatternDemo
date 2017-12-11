package com.sea.pattern.command;

import com.sea.pattern.command.impl.HolidayCommond;
import com.sea.pattern.command.impl.WorkCommond;

public class Main {

	public static void main(String[] args) {
		// 被调用者
		Receiver receiver = new Receiver();
		// 被调用者要执行的命令
		Command workCmd = new WorkCommond(receiver);
		Command holidayCmd = new HolidayCommond(receiver);

		// 调用者
		Invoker invoker = new Invoker();
		invoker.addCmd(workCmd);
		invoker.addCmd(workCmd);
		invoker.addCmd(workCmd);
		invoker.addCmd(workCmd);
		invoker.addCmd(workCmd);
		invoker.addCmd(holidayCmd);
		invoker.addCmd(holidayCmd);
		invoker.action();
	}

}
