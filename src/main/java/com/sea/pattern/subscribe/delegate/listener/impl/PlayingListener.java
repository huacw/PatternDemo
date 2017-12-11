package com.sea.pattern.subscribe.delegate.listener.impl;

import java.util.Date;

import com.sea.pattern.subscribe.delegate.listener.IListener;

/**
 * 
 * ��Ϸ������
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class PlayingListener implements IListener {
	{
		start();
	}

	@Override
	public void stop() {
		System.out.println("������Ϸ������ʱ�䣺" + new Date());
	}

	@Override
	public void start() {
		System.out.println("��ʼ��Ϸ����ʼʱ�䣺" + new Date());
	}

}
