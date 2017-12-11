package com.sea.pattern.subscribe.delegate.event;

/**
 * 
 * 事件接口
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface IEvent {
	public void invoke() throws Exception;
}
