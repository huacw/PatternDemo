package com.sea.pattern.subscribe.delegate.handler;

import com.sea.pattern.subscribe.delegate.listener.IListener;

/**
 * 
 * 事件处理器接口
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface IEventHandler {
	// 添加某个对象要执行的事件，及需要的参数
	public void addEvent(IListener listener, String method, Object... args);

	// 通知所有的对象执行指定的事件
	public void notice() throws Exception;
}
