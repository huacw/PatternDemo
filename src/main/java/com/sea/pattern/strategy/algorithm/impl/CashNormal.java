package com.sea.pattern.strategy.algorithm.impl;

import com.sea.pattern.strategy.algorithm.CashStrategy;

/**
 * 
 * ��ͨ�㷨
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class CashNormal extends CashStrategy {

	@Override
	public double appectCash(double money) {
		return money;
	}

}
