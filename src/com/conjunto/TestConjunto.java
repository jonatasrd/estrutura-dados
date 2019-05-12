package com.conjunto;

public class TestConjunto {

	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Jonatas");
		System.out.println(conjunto);
		
		
		conjunto.adiciona("Fernando");
		System.out.println(conjunto);
		
		conjunto.adiciona("Jaqueline");
		conjunto.adiciona("Jaqueline");
		System.out.println(conjunto);
		
		conjunto.adiciona("João");
		System.out.println(conjunto);
		
		conjunto.remove("Fernando");
		System.out.println(conjunto);
		
	}

}
