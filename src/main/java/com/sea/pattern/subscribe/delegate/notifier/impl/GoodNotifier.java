package com.sea.pattern.subscribe.delegate.notifier.impl;

import com.sea.pattern.subscribe.delegate.listener.IListener;
import com.sea.pattern.subscribe.delegate.notifier.Notifier;

/**
 * 
 * 具体通知人
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class GoodNotifier extends Notifier {

	@Override
	public void addListener(IListener listener) {
		System.out.println("添加新的监听器");
		this.getHandler().addEvent(listener, "stop");
	}

	@Override
	public void notice() {
		System.out.println("通知所有已注册的监听器");
		try {
			this.getHandler().notice();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
