//********************************************************************
// Assignment 1 - COMP248 Summer 2018
// Program 2: Fidelity Card Reward
// Author: A.Signorino - 400007205
//
//  This program prompts the user to enter two sets of values and 
//  calculates sum, difference, multiplication, division, and modulo
//********************************************************************

import java.util.Scanner;

public class FidelityCardReward {

	public static void main(String[] args) {
		
		// Card values
		int card1, card2, card3, card4;
		
		// Calculated stars sum and rewards
		int sum, updatedSum, latte, tictac, starsTot;
		
		// Constants for reward rates
		final int LATTE_RATE = 7;
		final int TICTAC_RATE = 2;
		
		// Creating a keyboard object
		Scanner keyboard = new Scanner(System.in);
		
		// Print welcome message and user input prompt
		System.out.println("===========================================");
		System.out.println("Welcome to the Fidelity Card Rewards System");
		System.out.println("===========================================");
		System.out.println("You can redeem a maximum of 4 cards at a time.");
		System.out.println();
		
		System.out.print("Please enter the number of stars on card 1:");
		card1 = keyboard.nextInt();
		System.out.println();
		
		System.out.print("Please enter the number of stars on card 2:");
		card2 = keyboard.nextInt();
		System.out.println();
		
		System.out.print("Please enter the number of stars on card 3:");
		card3 = keyboard.nextInt();
		System.out.println();
		
		System.out.print("Please enter the number of stars on card 4:");
		card4 = keyboard.nextInt();
		System.out.println();
		
		// Calculate and print sum of card stars
		sum = card1+card2+card3+card4;
		System.out.println("You have a total of "+ sum +" stars.");

		// Calculate rewards with maximum lattes possible, update sum
		latte = sum/LATTE_RATE; 
		updatedSum = sum-(latte*LATTE_RATE);
		tictac = updatedSum/TICTAC_RATE;
		starsTot = updatedSum-(tictac*TICTAC_RATE);
		if (starsTot < 0) {
			starsTot = 0;
		}

		// Print reward results
		System.out.println("You could redeem them for "+ latte +" latte(s), "+ tictac +" tic-tac(s) and you will have "+ starsTot +" star left.");
		System.out.println();
		System.out.println("Enjoy your break!");
		
	}

}
