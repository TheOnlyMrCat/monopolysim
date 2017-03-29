package com.dockdev.chance.cards;
import com.dockdev.chance.Data;
import com.dockdev.chance.App;
import com.dockdev.chance.Rand;
import com.dockdev.chance.simulators.Jail;

public class Chest {
	
	public static void chestDraw(){
		Data.chestcards++;
		
		int card = Rand.cardDraw();
		if (card == 0){
			if (App.jailsim)
				Jail.toJail();
			else
				App.space = 10;
		}else if (card == 1){
			Jail.chestjail = true;
		}else if (card == 2){
			App.space = 0;
		}
	}
}
