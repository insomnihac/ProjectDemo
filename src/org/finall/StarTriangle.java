package org.finall;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {

		int rowNum;

		Scanner myScan = new Scanner(System.in);
		System.out.println(" Enter the row number for Star Triangle");

		rowNum = myScan.nextInt();

		for (int i = 1; i <= rowNum; i++) {

			for (int j = 1; j <= rowNum - i; j++) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {

				System.out.print(" * ");
			}
			System.out.println();

		}

	}

}
