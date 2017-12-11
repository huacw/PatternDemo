package com.sea.pattern.subscribe.delegate.handler;

import com.sea.pattern.subscribe.delegate.listener.IListener;

/**
 * 
 * �¼��������ӿ�
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface IEventHandler {
	// ���ĳ������Ҫִ�е��¼�������Ҫ�Ĳ���
	public void addEvent(IListener listener, String method, Object... args);

	// ֪ͨ���еĶ���ִ��ָ�����¼�
	public void notice() throws Exception;
}
