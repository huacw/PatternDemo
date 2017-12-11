package com.sea.pattern.facade;

import com.sea.pattern.facade.impl.Pedestrianism;
import com.sea.pattern.facade.impl.SelfDrivingTravelling;

public class Main {

	public static void main(String[] args) {
		ITravel t1 = new Pedestrianism();
		t1.travel();
		System.out.println();
		ITravel t2 = new SelfDrivingTravelling();
		t2.travel();
	}

}
