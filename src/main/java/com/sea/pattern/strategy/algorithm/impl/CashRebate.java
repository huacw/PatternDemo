package com.sea.pattern.strategy.algorithm.impl;

import com.sea.pattern.strategy.algorithm.CashStrategy;

/**
 * 
 * �����㷨
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class CashRebate extends CashStrategy {
	private double rebate = 0.0d;// �ۿ�

	public CashRebate(double rebate) {
		super();
		this.rebate = rebate;
	}

	@Override
	public double appectCash(double money) {
		return money * rebate;
	}

}
