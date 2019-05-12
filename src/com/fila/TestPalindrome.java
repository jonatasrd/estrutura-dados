package com.fila;

public class TestPalindrome {

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();

		System.out.println("ete: " + palindrome.isPalindrome("ete"));
		System.out.println("kayak: " + palindrome.isPalindrome("kayak"));
		System.out.println("level: " + palindrome.isPalindrome("level"));
		System.out.println("was it a car or a cat I saw: "
				+ palindrome.isPalindrome("Was it a car or a cat I saw"));
		System.out.println("Step on no pets: " + palindrome.isPalindrome("Step on no pets"));
	}
}
