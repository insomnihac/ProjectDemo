package mem.delete;

import java.util.Scanner;

public class RightAngleTriangle1S {

	public static void main(String[] args) {

		int rowNum;

		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter the row number for a star Triangle : ");
		;
		rowNum = myScan.nextInt();

		for (int i = 1; i <= rowNum; i++) {

			for (int j = 1; j <= rowNum - 1; j++) {

				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {

				System.out.print(" 1 ");
			}

			System.out.println();
		}

	}

}
