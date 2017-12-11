package com.sea.pattern.mediator;

import com.sea.pattern.mediator.impl.Iraq;
import com.sea.pattern.mediator.impl.USA;
import com.sea.pattern.mediator.impl.UnitedNationsSecurityCouncil;

public class Main {

	public static void main(String[] args) {
		UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();
		USA usa = new USA(unsc);
		Iraq iraq = new Iraq(unsc);
		
		unsc.setIraq(iraq);
		unsc.setUsa(usa);
		
		usa.declare("不准研制核武器，否则就要挨打");
		iraq.declare("没有核武器，坚决抵抗侵略");
	}

}
