package com.sea.pattern.adapter.clazz;

/**
 * 
 * ��������
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void println() {
		System.out.println("Ŀ�����ӡ");
	}

}
