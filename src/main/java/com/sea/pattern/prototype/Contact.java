package com.sea.pattern.prototype;

/**
 * 
 * 联系方式
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Contact implements Cloneable {
	private String qq;
	private String email;
	private String moblie;

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMoblie() {
		return moblie;
	}

	public void setMoblie(String moblie) {
		this.moblie = moblie;
	}

	public Contact clone() {
		Contact contact = null;
		try {
			contact = (Contact) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return contact;
	}
	
	@Override
	public String toString() {
		return "Contact [qq=" + qq + ", email=" + email + ", moblie=" + moblie
				+ "]";
	}
}
