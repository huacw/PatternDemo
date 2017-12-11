package com.sea.pattern.chain;

/**
 * 
 * 处理器实现
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
		System.out.println(name + "处理中……");
		if (getHandler() != null) {
			getHandler().operator();
		}
		System.out.println(name + "处理完成。");
	}

}
