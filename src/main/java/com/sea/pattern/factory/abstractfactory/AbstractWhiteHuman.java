package com.sea.pattern.factory.abstractfactory;

/**
 * 
 * ��ɫ����
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class AbstractWhiteHuman implements Human {
	// ��ɫ���ֵ���ɫ�ǰ�ɫ��
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǰ�ɫ�ģ�");
	}

	// ��ɫ���ֽ���
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ�㶼�ǵ��ǵ��ֽڡ�");
	}
}
