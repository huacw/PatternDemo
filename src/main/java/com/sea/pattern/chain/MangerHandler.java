package com.sea.pattern.chain;

/**
 * 
 * ������ʵ��
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class MangerHandler extends AbstractHandler implements Handler {
	private String name;

	public MangerHandler(String name) {
		super();
		this.name = name;
	}

	@Override
	public void operator() {
		System.out.println(name + "�����С���");
		if (getHandler() != null) {
			getHandler().operator();
		}
		System.out.println(name + "������ɡ�");
	}

}
