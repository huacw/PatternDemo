package com.sea.pattern.composite;

public class Main {

	public static void main(String[] args) {
		Composite root = new Composite("���ڵ�");
		Composite comp1 = new Composite("�ڵ�1");
		Composite leaf1 = new Composite("Ҷ�ӽڵ�1");
		Composite leaf2 = new Composite("Ҷ�ӽڵ�2");
		comp1.add(leaf1);
		comp1.add(leaf2);
		Composite comp2 = new Composite("�ڵ�2");
		Composite leaf3 = new Composite("Ҷ�ӽڵ�3");
		comp2.add(leaf3);
		comp1.add(comp2);
		root.add(comp1);
		Composite comp3 = new Composite("�ڵ�3");
		root.add(comp3);
		Composite leaf4 = new Composite("Ҷ�ӽڵ�4");
		root.add(leaf4);
		
		root.display(1);
	}

}
