package com.sea.pattern.visitor.impl;

import com.sea.pattern.visitor.Status;

/**
 * 
 * ʧ��
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Fail implements Status {

	@Override
	public void getManStatus(Man man) {
		System.out.println("����ʧ��ʱ����ͷ�Ⱦƣ�˭Ҳ����Ȱ");
	}

	@Override
	public void getWomanStatus(Woman woman) {
		System.out.println("Ů��ʧ��ʱ������������˭ҲȰ����");
	}

}
