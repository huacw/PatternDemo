package com.sea.pattern.iterator;

/**
 * 
 * �����ӿ�
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface Iterator {
	// ǰ��
	// public Object previous();

	// ����
	public Object next();

	// �Ƿ���Ԫ��
	public boolean hasNext();

	// ȡ�õ�һ��Ԫ��
	public Object first();

	// ȡ�õ�һ��Ԫ��
	public Object last();

}
