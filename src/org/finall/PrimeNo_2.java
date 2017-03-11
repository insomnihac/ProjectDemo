package org.finall;

public class PrimeNo_2 {

	public boolean primeCheck(int n) {

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {

				return false;
			}

		}

		return true;

	}

	public static void main(String[] args) {

		PrimeNo_2 p = new PrimeNo_2();

		System.out.println("Check if prime or not : 07 " + p.primeCheck(7));
		System.out.println("Check if prime or not : 08 " + p.primeCheck(8));
		System.out.println("Check if prime or not : 89 " + p.primeCheck(89));
		System.out.println("Check if prime or not : 90 " + p.primeCheck(90));

	}

}
