package com.sea.pattern.subscribe.delegate.handler.imple;

import java.util.ArrayList;
import java.util.List;

import com.sea.pattern.subscribe.delegate.event.IEvent;
import com.sea.pattern.subscribe.delegate.event.impl.Event;
import com.sea.pattern.subscribe.delegate.handler.IEventHandler;
import com.sea.pattern.subscribe.delegate.listener.IListener;

/**
 * 
 * 事件处理器
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class EventHandler implements IEventHandler {
	private List<IEvent> events = new ArrayList<IEvent>();

	@Override
	public void addEvent(IListener listener, String method, Object... args) {
		events.add(new Event(listener, method, args));
	}

	@Override
	public void notice() throws Exception {
		for (IEvent event : events) {
			event.invoke();
		}
	}

}
