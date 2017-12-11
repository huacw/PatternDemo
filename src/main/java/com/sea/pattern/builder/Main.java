
package com.sea.pattern.builder;

import com.sea.pattern.builder.impl.FatPerson;
import com.sea.pattern.builder.impl.ThinPerson;

public class Main {

	public static void main(String[] args) {
		PersonDirector pd = new PersonDirector(new ThinPerson());
		pd.createPerson();
		System.out.println();
		PersonDirector pd1 = new PersonDirector(new FatPerson());
		pd1.createPerson();
	}

}
