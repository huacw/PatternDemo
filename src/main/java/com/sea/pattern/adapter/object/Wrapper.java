package com.sea.pattern.adapter.object;

/**
 * 
 * ����������
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Wrapper implements Targetable {
	private Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void println() {
		System.out.println("Ŀ�����ӡ");
	}

	@Override
	public void print() {
		if (source == null) {
			return;
		}
		source.print();
	}

}
