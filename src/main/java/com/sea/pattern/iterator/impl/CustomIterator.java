package com.sea.pattern.iterator.impl;

import com.sea.pattern.iterator.Collection;
import com.sea.pattern.iterator.Iterator;

/**
 * 
 * 自定义迭代器
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class CustomIterator implements Iterator {
	private Collection collection;
	private int currentIndex = -1;

	public CustomIterator(Collection collection) {
		super();
		this.collection = collection;
	}

	// @Override
	// public Object previous() {
	// if (collection == null) {
	// return null;
	// }
	// if (currentIndex > 0) {
	// currentIndex--;
	// }
	// return collection.get(currentIndex);
	// }

	@Override
	public Object next() {
		if (collection == null) {
			return null;
		}
		if (currentIndex < collection.size()) {
			currentIndex++;
		}
		return collection.get(currentIndex);
	}

	@Override
	public boolean hasNext() {
		if (currentIndex < collection.size() - 1) {
			return true;
		}
		return false;
	}

	@Override
	public Object first() {
		if (collection == null) {
			return null;
		}
		return collection.get(0);
	}

	@Override
	public Object last() {
		if (collection == null) {
			return null;
		}
		return collection.get(collection.size() - 1);
	}

}
