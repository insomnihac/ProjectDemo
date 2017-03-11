package org.sharath.memory;

import java.util.Scanner;

public class RightAngled1S_Triangle {

	public static void main(String[] args) {

		int rowNum;

		Scanner myScan = new Scanner(System.in);
		System.out.println(" Enter the number of row s for A STAR TRIANGLE : ");
		rowNum = myScan.nextInt();

		for (int i = 1; i <= rowNum; i++) {

			for (int j = 1; j <= rowNum - 1; j++) {

				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {

				System.out.print(" * ");
			}

			System.out.println();
		}

	}

}
