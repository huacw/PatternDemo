package com.sea.pattern.visitor;

import com.sea.pattern.visitor.impl.Fail;
import com.sea.pattern.visitor.impl.Man;
import com.sea.pattern.visitor.impl.Success;
import com.sea.pattern.visitor.impl.Woman;

public class Main {

	public static void main(String[] args) {
		Structure struct = new Structure();
		struct.add(new Man());
		struct.add(new Woman());
		
		Success success = new Success();
		struct.show(success);
		
		System.out.println("-----------------");
		
		Fail fail = new Fail();
		struct.show(fail);
	}

}
