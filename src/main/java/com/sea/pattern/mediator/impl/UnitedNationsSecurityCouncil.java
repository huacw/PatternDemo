package com.sea.pattern.mediator.impl;

import com.sea.pattern.mediator.Country;
import com.sea.pattern.mediator.UnitedNations;

/**
 * 
 * ∞≤¿Ìª·
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {
	private USA usa;
	private Iraq iraq;

	public USA getUsa() {
		return usa;
	}

	public void setUsa(USA usa) {
		this.usa = usa;
	}

	public Iraq getIraq() {
		return iraq;
	}

	public void setIraq(Iraq iraq) {
		this.iraq = iraq;
	}

	@Override
	public void declare(String message, Country country) {
		if (country instanceof USA) {
			iraq.getMessage(message);
		} else if (country instanceof Iraq) {
			usa.getMessage(message);
		}
	}

}
