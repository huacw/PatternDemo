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
		
		usa.declare("��׼���ƺ������������Ҫ����");
		iraq.declare("û�к�����������ֿ�����");
	}

}
