package com.dockdev.chance.cards;
import com.dockdev.chance.Data;
import com.dockdev.chance.App;
import com.dockdev.chance.Rand;
import com.dockdev.chance.simulators.Jail;

public class Chance {
	
	public static void chanceDraw(){
		Data.chancecards++;
		
		int card = Rand.cardDraw();
		if (card == 0){
			if (App.jailsim)
				Jail.toJail();
			else
				App.space = 10;
		}else if (card == 1)
			Jail.chancejail = true;
		else if (card == 2)
			App.space = 0;
		else if (2 < card && card < 6)
			App.space = 5 + 9 * (card - 2);
		else if (card == 6)
			App.space = 25;
		else if (card == 7)
			App.space = 35;
		else if (card == 8)
			App.space = 35;
		else if (card == 9)
			App.space -= 3;
		else if (card == 10){
			if (App.space < 13 || App.space > 28)
				App.space = 12;
			else
				App.space = 28;
		}
	}
}
