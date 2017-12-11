package com.sea.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * µ÷ÓÃÕß
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Invoker {
	private List<Command> commands = new ArrayList<Command>();

	public void addCmd(Command command) {
		commands.add(command);
	}

	public void action() {
		if (commands != null) {
			for (Command command : commands) {
				command.execute();
			}
		}
	}
}
