package com.sea.pattern.subscribe.impl;

import com.sea.pattern.subscribe.IWatcher;

/**
 * 
 * ����۲���
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Watcher implements IWatcher {

	@Override
	public void update(String msg) {
		System.out.println("�յ���Ϣ��" + msg);
	}

}
