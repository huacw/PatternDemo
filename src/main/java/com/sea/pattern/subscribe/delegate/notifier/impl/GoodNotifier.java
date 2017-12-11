package com.sea.pattern.subscribe.delegate.notifier.impl;

import com.sea.pattern.subscribe.delegate.listener.IListener;
import com.sea.pattern.subscribe.delegate.notifier.Notifier;

/**
 * 
 * ����֪ͨ��
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class GoodNotifier extends Notifier {

	@Override
	public void addListener(IListener listener) {
		System.out.println("����µļ�����");
		this.getHandler().addEvent(listener, "stop");
	}

	@Override
	public void notice() {
		System.out.println("֪ͨ������ע��ļ�����");
		try {
			this.getHandler().notice();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
