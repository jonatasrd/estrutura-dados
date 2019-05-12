package com.pilha;

import java.util.Stack;

public class TestaStack {

	public static void main(String[] args) {
		Stack<String> nomes = new Stack<String>();
		
		nomes.push("Jonatas");
		nomes.push("João");
		nomes.push("Fred");
		nomes.push("Juca");
		nomes.push("Amendoim");
		
		System.out.println(nomes);
		
		nomes.pop();
		
		System.out.println(nomes);
		
		System.out.println(nomes.peek());
		
		System.out.println(nomes.isEmpty());
		
		nomes.clear();
		
		System.out.println(nomes);
	}
}
