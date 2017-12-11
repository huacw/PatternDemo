package com.sea.pattern.factory.abstractfactory;

import com.sea.pattern.factory.abstractfactory.impl.MaleBlackHuman;
import com.sea.pattern.factory.abstractfactory.impl.MaleWhiteHuman;
import com.sea.pattern.factory.abstractfactory.impl.MaleYellowHuman;

/**
 * 
 * 男性人种工厂
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class MaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

}
