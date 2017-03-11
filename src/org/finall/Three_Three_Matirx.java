package org.finall;

public class Three_Three_Matirx {

	public static void main(String[] args) {

		int arr[][] = new int[3][3];

		int val = 10;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				arr[i][j] = val;
				val = val + 10;
			}
		}

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
