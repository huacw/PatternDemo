package com.sea.pattern.facade.impl;

import com.sea.pattern.facade.ITravel;

/**
 * 
 * ͽ������
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Pedestrianism implements ITravel {

	@Override
	public void travel() {
		System.out.println("׼��ͽ������");
		System.out.println("׼��ʳ���ˮ");
		System.out.println("ͽ����Ŀ�ĵس���");
	}
	
}
