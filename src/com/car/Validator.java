// Title: Lab No 11 (Part 1)
// Author: John Aoraha
// Date: May 7, 2018

package com.car;

import java.util.Scanner;

public class Validator {

	public static double getDouble(Scanner scan, String prompt) {

		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (scan.hasNextDouble()) {
				d = scan.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid value. Try again.");
			}
			scan.nextLine();
		}
		return d;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine();
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("The first automobile was built in 1886. Try again.");
			else if (i > max)
				System.out.println("Sure...your car is from the future. Try again.");
			else
				isValid = true;
		}
		return i;
	}

	public static String isEmpty(Scanner sc, String prompt) {
        System.out.print(prompt);
		String s = sc.nextLine(); 
		while (s.length() == 0) {
			System.out.println("You did not enter any information. Try again.");
			System.out.print(prompt);
			s = sc.nextLine();}      
		return s;
	}
}
