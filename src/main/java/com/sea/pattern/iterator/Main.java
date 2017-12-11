package com.sea.pattern.iterator;

import com.sea.pattern.iterator.impl.CustomCollection;

public class Main {

	public static void main(String[] args) {
		Collection collection = new CustomCollection(new String[] { "a", "d",
				"qww" });
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
