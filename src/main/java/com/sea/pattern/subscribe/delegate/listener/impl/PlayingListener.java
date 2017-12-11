package com.sea.pattern.subscribe.delegate.listener.impl;

import java.util.Date;

import com.sea.pattern.subscribe.delegate.listener.IListener;

/**
 * 
 * 游戏监听器
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class PlayingListener implements IListener {
	{
		start();
	}

	@Override
	public void stop() {
		System.out.println("结束游戏，结束时间：" + new Date());
	}

	@Override
	public void start() {
		System.out.println("开始游戏，开始时间：" + new Date());
	}

}
