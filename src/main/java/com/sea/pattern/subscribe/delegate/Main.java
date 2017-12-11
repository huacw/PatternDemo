package com.sea.pattern.subscribe.delegate;

import java.util.Date;

import com.sea.pattern.subscribe.delegate.listener.IListener;
import com.sea.pattern.subscribe.delegate.notifier.Notifier;
import com.sea.pattern.subscribe.delegate.notifier.impl.GoodNotifier;

public class Main {

	public static void main(String[] args) {
		// 创建一个尽职尽责的放哨者
		Notifier goodNotifier = new GoodNotifier();
		goodNotifier.addListener(new IListener() {
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
		});

		goodNotifier.addListener(new IListener() {
			{
				start();
			}

			@Override
			public void stop() {
				System.out.println("结束写作业，结束时间：" + new Date());
			}

			@Override
			public void start() {
				System.out.println("开始写作业，开始时间：" + new Date());
			}
		});

		System.out.println();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		goodNotifier.notice();
	}
}
