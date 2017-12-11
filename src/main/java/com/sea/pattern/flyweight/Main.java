package com.sea.pattern.flyweight;


public class Main {

	public static void main(String[] args) {
		ConnectionPool pool = ConnectionPool.newInstance(20);
		System.out.println(pool.getAvailableConnectionSize());
		pool.getConnection();
		System.out.println(pool.getAvailableConnectionSize());
		pool.release();
		System.out.println(pool.getAvailableConnectionSize());
	}

}
