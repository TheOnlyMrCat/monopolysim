package com.dockdev.chance;

import com.dockdev.chance.simulators.Run;

public class Console {
	
	private static boolean playermul;

	public static void main(String[] args) {
		playermul = Init.init();
		if (!playermul){
			for (App.move = 0; App.move <= App.moves; App.move++){
				Run.run();
			}
		}else{
			for (App.move = 0; App.move <= App.moves; App.move++){
				Run.initPlayers();
			}
		}
		Data.finmon = App.money;
		Run.file();
	}
}
