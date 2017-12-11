package com.sea.pattern.iterator.impl;

import com.sea.pattern.iterator.Collection;
import com.sea.pattern.iterator.Iterator;

/**
 * 
 * 用户自定义集合
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class CustomCollection implements Collection {
	private String[] datas;

	public CustomCollection(String[] datas) {
		super();
		this.datas = datas;
	}

	@Override
	public Iterator iterator() {
		return new CustomIterator(this);
	}

	@Override
	public Object get(int i) {
		if (datas == null || i < 0 || i >= datas.length) {
			return null;
		}
		return datas[i];
	}

	@Override
	public int size() {
		if (datas == null) {
			return -1;
		}
		return datas.length;
	}

}
