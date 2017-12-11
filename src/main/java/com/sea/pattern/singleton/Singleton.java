package com.sea.pattern.singleton;

/**
 * 
 * ���̵߳�����
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
