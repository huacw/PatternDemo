package com.sea.pattern.prototype;

/**
 * 
 * 人员信息
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Person implements Cloneable {
	private String name;
	private int age;
	private String sex;

	private Contact contact;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Person clone() {
		Person person = null;
		try {
			person = (Person) super.clone();
			person.setContact(contact.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return person;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", contact=" + contact + "]";
	}
}
