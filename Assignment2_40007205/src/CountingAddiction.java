//********************************************************************
// Assignment 2 - COMP248 Summer 2018
// Program 2: Counting Addiction
// Author: A.Signorino - 400007205
//
// This program helps Lucie deal with her counting addiction by asking 
// the user for a sentence and counts the frequency of each letter, 
// then displays statistics about these frequencies
//********************************************************************

import java.util.Scanner;

public class CountingAddiction {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// Constants
		
		// Variables
		String sentence;
		int frequency;
	//	char c;
		
		
		// Welcome message
		System.out.println("===========================");
		System.out.println("Welcome to the Counting Addiction Program");
		System.out.println("===========================");
		System.out.print("Enter a sentence: ");
		
		// Ignore case
		// Must be letters only (see ascii range)
		// Must be one letter at least
		
		sentence = keyboard.nextLine();
		sentence.equalsIgnoreCase(sentence);
		sentence.equals('a');
		
		char c = '*';

		if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
			  System.out.println("$c is an alphabet.");
		
		
		// Display frequency of each of 26 letters
//		for (char c1 = 'a'; c1 <= 'z'; c1++);
//		{ 
//			System.out.println("The letter "+c1+" has a frequency of "); //+frequency
//		}
//			
		
		// Display the frequency of the most frequent letter
		// Display the frequency of the least frequent letter but at least once
		// Display number of letters that have frequency of zero
		
		

	}

}
