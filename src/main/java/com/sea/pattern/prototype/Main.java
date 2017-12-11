package com.sea.pattern.prototype;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(24);
		p1.setName("ÕÅÈý");
		p1.setSex("ÄÐ");
		Contact contact = new Contact();
		contact.setEmail("12@163.com");
		contact.setMoblie("123456789");
		contact.setQq("12345");
		p1.setContact(contact);
		Person p2 = (Person) p1.clone();
		System.out.println("p1:" + p1);
		System.out.println("p2:" + p2);
		System.out.println();
		p2.setAge(25);
		System.out.println("p1:" + p1);
		System.out.println("p2:" + p2);
		System.out.println();
		Contact contact2 = p2.getContact();
		contact2.setMoblie("0123456789");
		System.out.println("p1:" + p1);
		System.out.println("p2:" + p2);
	}

}
