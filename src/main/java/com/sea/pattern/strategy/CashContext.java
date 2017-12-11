package com.sea.pattern.strategy;

import com.sea.pattern.strategy.algorithm.CashStrategy;

/**
 * 
 * ���ò���������
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class CashContext {
	private CashStrategy cashStrategy;

	public CashContext(CashStrategy cashStrategy) {
		super();
		this.cashStrategy = cashStrategy;
	}

	public double getPayMoney(double money) {
		return cashStrategy.appectCash(money);
	}
}
