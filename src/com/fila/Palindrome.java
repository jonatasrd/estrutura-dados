package com.fila;

import java.util.Deque;
import java.util.LinkedList;

public class Palindrome {

	public boolean isPalindrome(String aString) {
		if (aString.length() == 0 || aString.isEmpty()) {
			return false;
		}

		Deque<Character> deque = new LinkedList<Character>();
		String lowerString = aString.toLowerCase().replaceAll(" ", "");

		boolean isEqual = true;

		char firstChar, lastChar;

		for (int i = 0; i < lowerString.length(); i++) {
			deque.addLast(lowerString.charAt(i));
		}

		while (deque.size() > 1 && isEqual) {
			firstChar = deque.removeFirst();
			lastChar = deque.removeLast();

			if (firstChar != lastChar) {
				isEqual = false;
			}

		}

		return isEqual;
	}
}
