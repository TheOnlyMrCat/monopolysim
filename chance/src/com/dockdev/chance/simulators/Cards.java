package com.dockdev.chance.simulators;

import com.dockdev.chance.App;
import com.dockdev.chance.cards.Chance;
import com.dockdev.chance.cards.Chest;

public class Cards {
	
	public void cardDraw(){
		
		if (App.space == 2 || App.space == 17 || App.space == 33){
			Chest.chestDraw();
			System.out.println("Communty chest card");
		}else if (App.space == 7 || App.space == 22 || App.space == 36){
			Chance.chanceDraw();
			System.out.println("Chance card");
		}
		System.out.println("Final space: " + App.space);
	}
}
