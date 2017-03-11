package mem.delete;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		int givenNum, revNum = 0, rem;

		Scanner myScan = new Scanner(System.in);
		System.out.println(" Enter a number to check if palindrome or not : ");
		givenNum = myScan.nextInt();

		int n = givenNum;

		while (n != 0) {

			rem = n % 10;
			revNum = revNum * 10 + rem;
			n = n / 10;

		}

		if (givenNum == revNum) {

			System.out.println("  Yaya !!! number is palindrome !!!! ");
		}

		else {

			System.out.println(" OOPS XXXX Number is not a palindrome XXX ");
		}

	}

}
