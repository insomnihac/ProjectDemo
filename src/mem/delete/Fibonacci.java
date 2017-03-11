package mem.delete;

public class Fibonacci {

	public static void main(String[] args) {

		int prev, next, sum;

		prev = next = 1;

		for (int i = 0; i < 10; i++) {

			System.out.println(prev);
			sum = prev + next;
			prev = next;
			next = sum;
		}

	}

}
