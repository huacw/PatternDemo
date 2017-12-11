package com.sea.pattern.chain;

public class Main {

	public static void main(String[] args) {
		MangerHandler h1 = new MangerHandler("С�鳤");
		MangerHandler h2 = new MangerHandler("��Ŀ����");
		MangerHandler h3 = new MangerHandler("�ܼ�");
		MangerHandler h4 = new MangerHandler("�ܾ���");
		h1.setHandler(h2);
		h2.setHandler(h3);
		h3.setHandler(h4);
		
		h1.operator();
	}

}
