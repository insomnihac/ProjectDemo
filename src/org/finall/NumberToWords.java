package org.finall;

public class NumberToWords {

	final private static String[] ones = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	final private static String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static String Convert(Integer i) {

		if (i < 20)
			return ones[i];
		if (i < 100)
			return tens[i / 10] + ((i % 10 > 0) ? " " + Convert(i % 10) : "");

		if (i < 1000)
			return ones[i / 100] + " Hundred " + ((i % 100 > 0) ? " And " + Convert(i % 100) : "  ");

		if (i < 1000000)
			return Convert(i / 1000) + " Thousand " + ((i % 1000 > 0) ? "" + Convert(i % 1000) : " ");

		return Convert(i / 1000000) + " Million " + ((i % 1000000 > 0) ? " " + Convert(i % 1000000) : " ");
	}

	public static void main(String[] args) {

		for (int i = 0; i < 1000000000; i++) {

			System.out.println(+i + " In Words IS : " + Convert(i));
		}

	}

}
