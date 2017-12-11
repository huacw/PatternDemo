package com.sea.pattern.subscribe.delegate;

import java.util.Date;

import com.sea.pattern.subscribe.delegate.listener.IListener;
import com.sea.pattern.subscribe.delegate.notifier.Notifier;
import com.sea.pattern.subscribe.delegate.notifier.impl.GoodNotifier;

public class Main {

	public static void main(String[] args) {
		// ����һ����ְ����ķ�����
		Notifier goodNotifier = new GoodNotifier();
		goodNotifier.addListener(new IListener() {
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
		});

		goodNotifier.addListener(new IListener() {
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
