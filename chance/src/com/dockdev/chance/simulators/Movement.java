package com.dockdev.chance.simulators;

import com.dockdev.chance.App;
import com.dockdev.chance.Rand;

public class Movement {
	
	public static void move(){
		
		int die1 = Rand.diceRoll();
		int die2 = Rand.diceRoll();
		App.space += die1 + die2;
		if (die1 == die2){
			if (App.jailsim)
				Jail.doubles++;
		}
		
		if (App.space > 39){
			App.space -= 39;
			App.money+= 200;
		}
		System.out.println();
		System.out.println("Move" + App.move + ":");
		System.out.println("Current space: " + App.space);
		
		if (App.space == 30){
			if (App.jailsim){
				Jail.toJail();
			}else{
				App.space = 10;
			}
		}
	}
}
