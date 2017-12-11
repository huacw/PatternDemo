package com.sea.pattern.strategy.algorithm.impl;

import com.sea.pattern.strategy.algorithm.CashStrategy;

/**
 * 
 * ·µÀûËã·¨
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class CashReturn extends CashStrategy {
	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;

	public CashReturn(double moneyCondition, double moneyReturn) {
		super();
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	@Override
	public double appectCash(double money) {
		double returnMoney = money;
		if (money >= moneyCondition) {
			returnMoney = money - Math.floor(money / moneyCondition)
					* moneyReturn;
		}
		return returnMoney;
	}
}
