package com.sea.pattern.composite;

public class Main {

	public static void main(String[] args) {
		Composite root = new Composite("根节点");
		Composite comp1 = new Composite("节点1");
		Composite leaf1 = new Composite("叶子节点1");
		Composite leaf2 = new Composite("叶子节点2");
		comp1.add(leaf1);
		comp1.add(leaf2);
		Composite comp2 = new Composite("节点2");
		Composite leaf3 = new Composite("叶子节点3");
		comp2.add(leaf3);
		comp1.add(comp2);
		root.add(comp1);
		Composite comp3 = new Composite("节点3");
		root.add(comp3);
		Composite leaf4 = new Composite("叶子节点4");
		root.add(leaf4);
		
		root.display(1);
	}

}
