// The factorial of 5! = 5x4x3x2x1 = 120

package org.finall;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int n ;
		int prod = 1;

		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial : ");

		n = myScan.nextInt();

		for (int i = n; i > 0; i--) {

			prod = prod * i;

		}

		System.out.println(" Factorial of " + n + " is :  " + prod);

	}

}
