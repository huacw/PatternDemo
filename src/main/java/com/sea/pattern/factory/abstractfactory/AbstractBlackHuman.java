package com.sea.pattern.factory.abstractfactory;

/**
 * 
 * ��ɫ����
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class AbstractBlackHuman implements Human {
	// ��ɫ���ֵ���ɫ�ǰ�ɫ��
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�Ǻ�ɫ�ģ�"); 
	}

	// ��ɫ���ֽ���
	public void talk() {
		System.out.println("���˻�˵����һ������������"); 
	}
}
