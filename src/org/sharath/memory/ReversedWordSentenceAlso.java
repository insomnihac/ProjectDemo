package org.sharath.memory;

public class ReversedWordSentenceAlso {

	public static void main(String[] args) {

		// String word = "!!! India Love I";

		String word = "I Love India !!!!";
		String revWord = "";
		String reversedWord = "";

		String[] split = word.split("");

		for (int i = split.length - 1; i >= 0; i--) {

			revWord = revWord + (split[i] + "");
			reversedWord = revWord + "";
		}

		System.out.println(reversedWord.trim());

	}

}
