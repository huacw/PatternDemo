package com.sea.pattern.proxy;

/**
 * 
 * ≤‚ ‘¿‡
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Main {

	public static void main(String[] args) {
		Subject subject = new RealSubject();
		Proxy proxy = new Proxy(subject);
		proxy.operate();
	}

}
