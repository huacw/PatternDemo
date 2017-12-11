package com.sea.pattern.iterator;

/**
 * 
 * 集合接口
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public interface Collection {
	public Iterator iterator();

	/* 取得集合元素 */
	public Object get(int i);

	/* 取得集合大小 */
	public int size();

}
