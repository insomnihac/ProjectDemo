package org.sharath.memory;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		int givenNumber, revNum = 0, rem;

		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter a number to check if palindrome : ");
		givenNumber = myScan.nextInt();

		int n = givenNumber;

		while (n != 0) {

			rem = n % 10;
			revNum = revNum * 10 + rem;
			n = n / 10;

		}

		if (givenNumber == revNum) {

			System.out.println("YAYA !!! Number is palindrome !!!!");

		}

		else {
			System.out.println("OOPS XXXXX X  Number is not a Palindrome XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		}

	}

}
