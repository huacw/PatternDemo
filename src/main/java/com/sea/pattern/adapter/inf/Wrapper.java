package com.sea.pattern.adapter.inf;

/**
 * 
 * �ӿ�������
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class Wrapper implements Sourceable {
	@Override
	public void println() {
		System.out.println("�������س���ӡ-----------");
	}

	@Override
	public void print() {
		System.out.println("��������ӡ���س�-----------");
	}

}
