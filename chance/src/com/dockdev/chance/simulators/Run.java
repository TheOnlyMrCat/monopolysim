package com.dockdev.chance.simulators;
import java.io.IOException;

import com.dockdev.chance.Data;
import com.dockdev.chance.App;
import com.dockdev.chance.Rand;
import com.dockdev.chance.cards.Chance;
import com.dockdev.chance.cards.Chest;
import com.dockdev.chance.simulators.Players;

public class Run {
	
	private static boolean declared = false;
	private static boolean playeradec = false;
	private static boolean playerbdec = false;
	private static boolean playercdec = false;
	private static boolean playerddec = false;
	
	private static Players playera;
	private static Players playerb;
	private static Players playerc;
	private static Players playerd;
	
	public static void run(){
		
		if (Jail.jailed){
			Jail.jailTurn();
		}
		
		if (App.movesim)
			Movement.move();
		
		if (App.cardsim && !App.movesim){
			if (Rand.randInt(0, 2) == 1)
				Chance.chanceDraw();
			else
				Chest.chestDraw();
		}
		
			Data.saveData(App.space);
	}
			
	public static void file(){

		Data data = new Data();

		data.writeToFile();
		try {
			data.openFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void runPlayers(){
		for(int i = 1; i <= App.players; i++){
			
			//Declares the players for the game
			if (!declared){
				if (i == 1) {
					playera = new Players();
					playeradec = true;
				}else if (i == 2){
					playerb = new Players();
					playerbdec = true;
				}else if (i == 3){
					playerc = new Players();
					playercdec = true;
				}else if (i == 4){
					playerd = new Players();
					playerddec = true;
				}
				declared = true;
			}
			
			//Makes each active player do their move
			if (i == 1 && playeradec) {
				playera.run();
			}else if (i == 2 && playerbdec){
				playerb.run();
			}else if (i == 3 && playercdec){
				playerc.run();
			}else if (i == 4 && playerddec){
				playerd.run();
			}
		}	
	}
}
 