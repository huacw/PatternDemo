package com.sea.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 数据结构
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Structure {
	private List<Person> persons = new ArrayList<Person>();

	public void add(Person person) {
		persons.add(person);
	}

	public void remove(Person person) {
		persons.remove(person);
	}

	public void show(Status status) {
		for (Person person : persons) {
			person.appcet(status);
		}
	}
}
