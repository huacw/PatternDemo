package com.sea.pattern.adapter.object;

/**
 * 
 * 对象适配器
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
		System.out.println("目标类打印");
	}

	@Override
	public void print() {
		if (source == null) {
			return;
		}
		source.print();
	}

}
