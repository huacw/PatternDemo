package com.sea.pattern.subscribe.impl;

import java.util.ArrayList;
import java.util.List;

import com.sea.pattern.subscribe.IWatched;
import com.sea.pattern.subscribe.IWatcher;

/**
 * 
 * 具体被观察者
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Watched implements IWatched {
	private List<IWatcher> sujects = new ArrayList<IWatcher>();

	@Override
	public void addWatcher(IWatcher subject) {
		sujects.add(subject);
	}

	@Override
	public void removeWatcher(IWatcher subject) {
		sujects.remove(subject);
	}

	@Override
	public void notifyWatchers(String str) {
		for (IWatcher subject : sujects) {
			subject.update(str);
		}
	}

}
