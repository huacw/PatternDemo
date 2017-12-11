package com.sea.pattern.subscribe.delegate.notifier;

import com.sea.pattern.subscribe.delegate.handler.IEventHandler;
import com.sea.pattern.subscribe.delegate.handler.imple.EventHandler;
import com.sea.pattern.subscribe.delegate.listener.IListener;

/**
 * 
 * ֪ͨ��
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

	// ������Ҫ��æ���ڵ�ѧ��
	public abstract void addListener(IListener listener);

	// ��������Ҫ��æ���ڵ�ѧ������ʦ����
	public abstract void notice();
}
