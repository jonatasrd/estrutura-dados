package com.pilha;

public class TestaPilha {
	
	public static void main(String[] args) {
		Pilha nomes = new Pilha();
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
