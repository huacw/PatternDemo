package com.sea.pattern.strategy;

import com.sea.pattern.strategy.algorithm.CashStrategy;
import com.sea.pattern.strategy.algorithm.impl.CashNormal;
import com.sea.pattern.strategy.algorithm.impl.CashRebate;
import com.sea.pattern.strategy.algorithm.impl.CashReturn;

/**
 * 
 * 费用策略工厂
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class CashFactory {
	private CashStrategy cashStrategy = null;

	public enum StrategyType {
		Normal, Rebate, Return;
		private double moneyCondition = 0.0d;
		private double moneyRebate = 0.0d;

		public double getMoneyCondition() {
			return moneyCondition;
		}

		public void setMoneyCondition(double moneyCondition) {
			this.moneyCondition = moneyCondition;
		}

		public double getMoneyRebate() {
			return moneyRebate;
		}

		public void setMoneyRebate(double moneyRebate) {
			this.moneyRebate = moneyRebate;
		}
	}

	/**
	 * 费用工厂
	 * 
	 * @param strategy
	 *            策略类型
	 */
	public CashFactory(StrategyType strategy) {
		switch (strategy) {
			case Normal:
				cashStrategy = new CashNormal();
				break;
			case Rebate:
				cashStrategy = new CashRebate(strategy.getMoneyRebate());
				break;
			case Return:
				cashStrategy = new CashReturn(strategy.getMoneyCondition(),
						strategy.getMoneyRebate());
				break;
			default:
				cashStrategy = new CashNormal();
				break;
		}
	}

	public double getPayMoney(double money) {
		if (cashStrategy == null) {
			return money;
		}
		return cashStrategy.appectCash(money);
	}
}
