// prime no is only divisible by itself of 0.

package org.finall;

import java.util.Scanner;

public class PrimeNo_1 {

	public static void main(String[] args) {

		int n, res;

		Scanner myScan = new Scanner(System.in);

		System.out.println(" Enter a number to check if prime : ");
		n = myScan.nextInt();

		for (int i = 2; i <= n / 2; i++) {

			res = n % i;

			if (res == 0) {

				System.out.println(+n + " OOPS XXX No is not a prime no XXX");
				break;
			} else {

				System.out.println(+n + " YAYA !! ! no is prime no !!!!");
				break;
			}

		}

	}

}
