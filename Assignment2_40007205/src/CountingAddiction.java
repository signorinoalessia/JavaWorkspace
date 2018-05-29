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
		String sentence = "";
		char[] c = sentence.toCharArray();
		int[] frequencyArray = new int[26];
		
		// Welcome message
		System.out.println("===========================");
		System.out.println("Welcome to the Counting Addiction Program");
		System.out.println("===========================");
		System.out.print("Enter a sentence: ");
		
		// Ignore case, must be letters only, must be one letter at least
		sentence = keyboard.nextLine();
		sentence.toLowerCase();
		// letters only smthg;

		// Display frequency of each of 26 letters
		for (int i=0; i<sentence.length(); i++)
		{
			int x = frequencyArray[sentence.charAt(i)]++;
			System.out.println("Results frequency: "+x);
		}
		
		
		
//		for (int x = 0; x < c.length; x++) {
//			for (int i = 0; i < sentence.length(); i++) {
//	            if (sentence.charAt(i) == x) {
//	            	frequencyArray[i]++;
//	            }
//				System.out.println("The letter "+x+" has a frequency of "+frequencyArray[i]); //+frequency
//			}
//		}	
		
//		if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
//		  System.out.println("$c is an alphabet.");	
	
		
		// Display the frequency of the most frequent letter
		// Display the frequency of the least frequent letter but at least once
		// Display number of letters that have frequency of zero
		
		

	}

}
