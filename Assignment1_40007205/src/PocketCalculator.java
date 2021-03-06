//********************************************************************
// Assignment 1 - COMP248 Summer 2018
// Program 1: Pocket Calculator
// Author: A.Signorino - 400007205
//
//  This program prompts the user to enter two sets of values and 
//  calculates sum, difference, multiplication, division, and modulo
//********************************************************************

import java.util.Scanner;

public class PocketCalculator {
	
	public static void main(String[] args) {
		
		// User-entered values
		int int1, int2;
		double double1, double2;
		
		// Calculated values
		int sum, diff, mult, div, mod;
		double sum2, diff2, mult2, div2, mod2;
		
		// Creating a Scanner object
		Scanner myKeyboard = new Scanner(System.in);
		
		// Print welcome message and prompt for integer input
		System.out.println("********** Welcome to my pocket Calculator **********");
		System.out.println();
		System.out.println("Let's try with integers first...");
		System.out.print("Enter Operand 1 (an integer): ");
		int1 = myKeyboard.nextInt();
		System.out.print("Enter Operand 1 (an integer): ");
		int2 = myKeyboard.nextInt();
		
		// Calculate integers
		sum = int1 + int2;
		diff = int1 - int2;
		mult = int1 * int2;
		div = int1 / int2;
		mod = int1 % int2;		
		
		// Print integer calculations
		System.out.println(int1+"+"+int2 +"="+sum);
		System.out.println(int1+"-"+int2 +"="+diff);
		System.out.println(int1+"*"+int2 +"="+mult);
		System.out.println(int1+"/"+int2+"="+div);
		System.out.println(int1+"%"+int2+"="+mod);
		
		// Print prompt for doubles input
		System.out.println();
		System.out.println("Let's try with doubles now...");
		System.out.print("Enter Operand 1 (a double): ");
		double1 = myKeyboard.nextInt();
		System.out.print("Enter Operand 1 (a double): ");
		double2 = myKeyboard.nextInt();
		
		// Calculate doubles
		sum2 = double1 + double2;
		diff2 = double1 - double2;
		mult2 = double1 * double2;
		div2 = double1 / double2;
		mod2 = double1 % double2;
		
		// Print doubles calculations
		System.out.println(double1+"+"+double2 +"="+sum2);
		System.out.println(double1+"-"+double2 +"="+diff2);
		System.out.println(double1+"*"+double2 +"="+mult2);
		System.out.println(double1+"/"+double2+"="+div2);
		System.out.println(double1+"%"+double2+"="+mod2);
		
		// Print final message
		System.out.println();
		System.out.println("Thank you for using my Pocket Calculator!");

	}

}
