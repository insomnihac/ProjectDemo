package org.finall;

public class ReverseWordAndSentence {
	
	public static void main(String[] args) {
		
		String word = "hello to you";
		String revWord ="";
		
		for(int i = word.length()-1;i>=0;i--) {
			
			revWord = revWord+word.charAt(i);
			
		}
		System.out.println(revWord);
		
		
	}

}
