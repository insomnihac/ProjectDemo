package org.finall;

public class Fibonacci {

	public static void main(String[] args) {

		int prev, next;
		int sum = 0;

		prev = next = 1;

		for (int i = 0; i < 10; i++) {

			System.out.println(prev);
			sum = prev + next;
			prev = next;
			next = sum;

		}

	}
}
