package com.dockdev.chance;

import java.util.concurrent.ThreadLocalRandom;

public class Rand {
	public static int diceRoll(){
		return ThreadLocalRandom.current().nextInt(1, 7);
	}
	
	public static int cardDraw(){
		int card = (int) (Math.random() * 17 + 1);
		return card;
	}
	
	public static int stratSel(){
		return ThreadLocalRandom.current().nextInt(0, 10);
	}
	
	public static int randInt(int min, int max){
		return min + (int)(Math.random() * (max - min));
	}
}
