package com.sea.pattern.composite;

/**
 * 
 * ×é¼þÀà
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public abstract class Component {
	private String name;

	public Component(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void add(Component component);

	public abstract void remove(Component component);

	public abstract void display(int depth);
}
