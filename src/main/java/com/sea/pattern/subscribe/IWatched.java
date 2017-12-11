package com.sea.pattern.subscribe;

/**
 * 
 * ���۲���
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface IWatched {
	public void addWatcher(IWatcher watcher);

	public void removeWatcher(IWatcher watcher);

	public void notifyWatchers(String str);
}
