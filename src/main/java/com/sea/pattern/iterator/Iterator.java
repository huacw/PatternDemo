package com.sea.pattern.iterator;

/**
 * 
 * 迭代接口
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface Iterator {
	// 前移
	// public Object previous();

	// 后移
	public Object next();

	// 是否还有元素
	public boolean hasNext();

	// 取得第一个元素
	public Object first();

	// 取得第一个元素
	public Object last();

}
