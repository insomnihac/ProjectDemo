package org.sharath.memory;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {

		String word, revWord = "";

		Scanner myScan = new Scanner(System.in);

		System.out.println("Enter a word to check if palindrome or not :");

		word = myScan.next();

		for (int i = word.length() - 1; i >= 0; i--) {

			revWord = revWord + word.charAt(i);

		}

		if (word.equals(revWord)) {

			System.out.println("YAYA !!! Word is palindrome !!!!!");

		}

		else {

			System.out.println("OOPS XXX Word is not a palinrome XXXX");
		}

	}

}
