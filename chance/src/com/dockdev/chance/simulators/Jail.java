package com.dockdev.chance.simulators;

import com.dockdev.chance.Data;
import com.dockdev.chance.App;
import com.dockdev.chance.Rand;

public class Jail {
	
	public static int doubles = 0;
	public static int conjailturns = 0;
	
	public static boolean chestjail = false;
	public static boolean chancejail = false;
	public static boolean jailed = false;
	
	public static void toJail(){
		App.space = 10;
		jailed = true;
	}
	
	public static void jailTurn(){
			App.space = 10;
			Data.jailtu++;
			conjailturns++;
			
			if (chancejail){
				chancejail = false;
				jailed = false;
				conjailturns = 0;
				return;
			}else if (chestjail){
				chestjail = false;
				jailed = false;
				conjailturns = 0;
				return;
			}
			
			int die1 = Rand.diceRoll();
			int die2 = Rand.diceRoll();
			
			if (die1 == die2){
				jailed = false;
			}
			if (conjailturns == 3){
				jailed = false;
				conjailturns = 0;
				App.money-= 50;
			}
	}
}
