package com.sea.pattern.subscribe.impl;

import com.sea.pattern.subscribe.IWatcher;

/**
 * 
 * 具体观察者
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Watcher implements IWatcher {

	@Override
	public void update(String msg) {
		System.out.println("收到消息：" + msg);
	}

}
