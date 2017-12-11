package com.sea.pattern.singleton;

/**
 * 
 * 单线程单例类
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton newInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
