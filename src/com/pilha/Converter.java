package com.pilha;

import java.util.Stack;

public class Converter {

	public String decimalToBibary(Integer decNumber) {
		Stack<Integer> remStack = new Stack<Integer>();
		
		int number = decNumber.intValue();
		int rem;
		StringBuilder binaryString = new StringBuilder("");
		
		while( number > 0) {
			rem = (int) Math.floor(number % 2);
			remStack.push(rem);
			number = (int) (number / 2);
		}
		
		while(!remStack.isEmpty()) {
			binaryString.append(remStack.pop().toString());
		}
		return binaryString.toString();
	}
}
