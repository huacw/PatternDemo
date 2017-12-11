package com.sea.pattern.command;

import com.sea.pattern.command.impl.HolidayCommond;
import com.sea.pattern.command.impl.WorkCommond;

public class Main {

	public static void main(String[] args) {
		// ��������
		Receiver receiver = new Receiver();
		// ��������Ҫִ�е�����
		Command workCmd = new WorkCommond(receiver);
		Command holidayCmd = new HolidayCommond(receiver);

		// ������
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
