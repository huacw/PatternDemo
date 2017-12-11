package com.sea.pattern.strategy;

public class Main {
	public static void main(String[] args) {
		// CashFactory.StrategyType strategy = CashFactory.StrategyType.Normal;
//		CashFactory.StrategyType strategy = CashFactory.StrategyType.Rebate;
//		strategy.setMoneyRebate(0.8);
		CashFactory.StrategyType strategy = CashFactory.StrategyType.Rebate;
		strategy.setMoneyRebate(10);
		strategy.setMoneyCondition(100);
		CashFactory cf = new CashFactory(strategy);
		System.out.println(cf.getPayMoney(234));
	}
}
