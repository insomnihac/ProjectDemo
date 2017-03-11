package org.sharath.memory;

import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {

		int n, res;

		Scanner myScan = new Scanner(System.in);
		System.out.println(" Enter a number to check prime or not : ");
		n = myScan.nextInt();

		for (int i = 2; i <= n / 2; i++) {

			res = n % i;

			if (res == 0) {

				System.out.println(" OOPS XXX Number is not Prime NO XXXX");
				break;
			}

			else {

				System.out.println("YAYA !!! Number is prime !!!!!!!!");
				break;
			}
		}

	}

}
