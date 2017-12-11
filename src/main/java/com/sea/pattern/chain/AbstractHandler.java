package com.sea.pattern.chain;

/**
 * 
 * ��������
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class AbstractHandler {
	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
