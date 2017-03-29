package com.dockdev.chance;

import java.util.Scanner;

public class Init {
	
	private static Scanner input;

	public static boolean init(){
		input = new Scanner(System.in);
		
		System.out.println("How many players?");
		App.players = input.nextInt();
		if (App.players == 1){
			System.out.println("Enable movesim?");
			int in = input.nextInt();
			if (in == 1)
				App.movesim = true;
		
			System.out.println("Enable jailsim?");
			in = input.nextInt();
			if (in == 1)
				App.jailsim = true;
		
			System.out.println("Enable cardsim?");
			in = input.nextInt();
			if (in == 1)
				App.cardsim = true;
		
			if (App.jailsim && !App.movesim)
				App.movesim = true;
		
			if (App.movesim)
				System.out.println("How many moves in game?");
			else
				System.out.println("How many cards to be drawn?");
			App.moves = input.nextInt();
			return false;
		}else if (App.players > 4){
			System.err.println("Number is too great. Maximum four players");
			System.exit(74);
		}else{
			System.out.println("How many moves in game?");
			App.moves = input.nextInt();
			return true;
		}
		System.exit(76);
		return false;
	}
}
