package com.sea.pattern.factory.abstractfactory;

/**
 * 
 * ��ɫ����
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class AbstractYellowHuman implements Human {
	// ��ɫ���ֵ���ɫ�ǻ�ɫ��
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǻ�ɫ�ģ�");
	}

	// ��ɫ���ֽ���
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ��˵�Ķ���˫�ֽڡ�");
	}
}
