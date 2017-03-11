package org.sharath.memory;

public class PrimeNo2 {

	public boolean PrimeCheck(int n) {

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {

				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {

		PrimeNo2 pm = new PrimeNo2();

		System.out.println("No is prime or not : 07 - " + pm.PrimeCheck(7));
		System.out.println("No is prime or not : 08 - " + pm.PrimeCheck(8));
		System.out.println("No is prime or not : 89 - " + pm.PrimeCheck(89));
		System.out.println("No is prime or not : 90 - " + pm.PrimeCheck(90));

	}

}
