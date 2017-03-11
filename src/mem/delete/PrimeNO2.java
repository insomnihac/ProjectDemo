package mem.delete;

public class PrimeNO2 {

	public boolean primeCheck(int n) {

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {

		PrimeNO2 pm = new PrimeNO2();

		System.out.println("Check if prime or not : 07 - " + pm.primeCheck(7));
		System.out.println("Check if prime or not : 08 - " + pm.primeCheck(8));
		System.out.println("Check if prime or not : 89 - " + pm.primeCheck(89));
		System.out.println("Check if prime or not : 90 - " + pm.primeCheck(90));

	}

}
