package com.dockdev.chance.simulators;

import com.dockdev.chance.Rand;

public class Stratsim {
	
	public static int strat = Rand.stratSel();
	
	public static void propertyLand(){
		if (strat == 0)
			allProperty();
	}

	private static void allProperty() {
		
	}
}
