package com.sea.pattern.factory.abstractfactory;

import com.sea.pattern.factory.abstractfactory.impl.FemaleBlackHuman;
import com.sea.pattern.factory.abstractfactory.impl.FemaleWhiteHuman;
import com.sea.pattern.factory.abstractfactory.impl.FemaleYellowHuman;

/**
 * 
 * Ů�����ֹ���
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class FemaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

}
