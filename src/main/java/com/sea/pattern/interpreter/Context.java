package com.sea.pattern.interpreter;

/**
 * 
 * иообнд
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Context {
	private int firstNum;
	private int secondNum;

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public Context(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
}
