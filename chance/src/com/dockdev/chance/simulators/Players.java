package com.dockdev.chance.simulators;

import com.dockdev.chance.Rand;

public class Players {
	
	public static int players = 0;
	
	public int space = 0;
	public int doubles = 0;
	public int money = 0;
	
	public int chancecards = 0;
	public int chestcards = 0;
	public int finmon = 0;
	
	public int medave = 0;
	public int balave = 0;
	public int oriave = 0;
	public int verave = 0;
	public int conave = 0;
	
	public int chapla = 0;
	public int staave = 0;
	public int virave = 0;
	public int jampla = 0;
	public int tenave = 0;
	public int newave = 0;
	
	public int kenave = 0;
	public int indave = 0;
	public int illave = 0;
	public int atlave = 0;
	public int venave = 0;
	public int margar = 0;
	
	public int pacave = 0;
	public int norave = 0;
	public int penave = 0;
	public int parpla = 0;
	public int boardw = 0;
	
	public int rerail = 0;
	public int perail = 0;
	public int borail = 0;
	public int shline = 0;
	
	public int elutil = 0;
	public int wautil = 0;
	
	public int inctax = 0;
	public int luxtax = 0;
	
	public int gojail = 0;
	public int frepar = 0;
	
	public int jailtu = 0;
	public int jailsp = 0;
	
	public Players(){
		players++;
	}
	
	public void move(){
		int die1 = Rand.diceRoll();
		int die2 = Rand.diceRoll();
		space += die1 + die2;
		if (die1 == die2)
			doubles++;
		else
			doubles = 0;
		
		if (space > 39){
			space -= 40;
			money += 200;
		}
	}
	
	public void run(){
		
	}
}
