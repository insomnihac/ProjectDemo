package org.finall;

public class ReverseWord {

	public static void main(String[] args) {

		String word = " Love India I";

		String revWord = "";
		String reversedWord = "";

		String[] split = word.split(" ");

		for (int i = split.length - 1; i >= 0; i--) {

			revWord = revWord + (split[i] + " ");

			reversedWord = revWord + "";
		}

		System.out.println(revWord.trim());

	}

}
