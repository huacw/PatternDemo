package com.sea.pattern.subscribe.delegate.listener.impl;

import java.util.Date;

import com.sea.pattern.subscribe.delegate.listener.IListener;

/**
 * 
 * ��Ϸ������
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class DoingHomeWorkingListener implements IListener {
	{
		start();
	}

	@Override
	public void stop() {
		System.out.println("����д��ҵ������ʱ�䣺" + new Date());
	}

	@Override
	public void start() {
		System.out.println("��ʼд��ҵ����ʼʱ�䣺" + new Date());
	}

}
