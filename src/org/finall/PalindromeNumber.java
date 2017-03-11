package org.finall;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int givenNumber, rem , revNum=0;
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.println(" Enter a Number to check palindrome or not :  ");
		givenNumber = myScan.nextInt();
		
		int n= givenNumber;
		
		while (n!=0) {
			
			rem = n%10;
			revNum = revNum * 10+ rem;
			n= n/10;
			
		}
		
		if(givenNumber == revNum) {
			
			System.out.println(" YAYA  !!! Number is Palindrome !!!");
		}
		
		else {
			
			System.out.println(" OOPS XXX No is not a palindrome XXXX");
		}
		
	}

}
