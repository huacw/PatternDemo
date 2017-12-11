package com.sea.pattern.visitor.impl;

import com.sea.pattern.visitor.Status;

/**
 * 
 * �ɹ�
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Success implements Status {

	@Override
	public void getManStatus(Man man) {
		System.out.println("���˳ɹ�ʱ����������һ��ΰ���Ů��");
	}

	@Override
	public void getWomanStatus(Woman woman) {
		System.out.println("Ů�˳ɹ�ʱ����������һ�����ɹ�������");
	}

}
