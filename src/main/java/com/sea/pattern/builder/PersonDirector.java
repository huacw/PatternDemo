package com.sea.pattern.builder;

/**
 * 
 * 人员创建指挥官
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class PersonDirector {
	private PersonBuilder person;

	public PersonDirector(PersonBuilder person) {
		super();
		this.person = person;
	}

	public void createPerson() {
		person.createHead();
		person.createBody();
		person.createArm();
		person.createLeg();
	}
}
