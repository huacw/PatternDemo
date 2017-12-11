package com.sea.pattern.singleton.mutilthread;


/**
 * 
 * ���̵߳ĵ�����
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
