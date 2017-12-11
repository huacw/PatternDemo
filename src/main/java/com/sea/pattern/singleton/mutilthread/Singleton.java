package com.sea.pattern.singleton.mutilthread;


/**
 * 
 * 多线程的单例类
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Singleton {
	private static Singleton instance;
	private static String synObj = "lock";

	private Singleton() {
	}

	public static Singleton newInstance() {
		if (instance == null) {
			synchronized (synObj) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
