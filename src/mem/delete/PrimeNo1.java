package mem.delete;

import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {

		int res, n;

		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter a number to check If no is prime or not : ");
		n = myScan.nextInt();

		for (int i = 2; i <= n / 2; i++) {

			res = n % i;

			if (res == 0) {

				System.out.println(+ n + " OOPS XXXXXXXX Not a prime no XXXXXXXXXXX ");
				break;
			}

			else {

				System.out.println(+ n + " YAYA !!!!!! Is a  prime no !!!! ");
				break;
			}

		}

	}

}
