package com.sea.pattern.subscribe.delegate.notifier;

import com.sea.pattern.subscribe.delegate.handler.IEventHandler;
import com.sea.pattern.subscribe.delegate.handler.imple.EventHandler;
import com.sea.pattern.subscribe.delegate.listener.IListener;

/**
 * 
 * 通知者
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class Notifier {
	private IEventHandler handler = new EventHandler();

	public IEventHandler getHandler() {
		return handler;
	}

	public void setHandler(IEventHandler handler) {
		this.handler = handler;
	}

	// 增加需要帮忙放哨的学生
	public abstract void addListener(IListener listener);

	// 告诉所有要帮忙放哨的学生：老师来了
	public abstract void notice();
}
