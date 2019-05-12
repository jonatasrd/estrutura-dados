package com.lista;

public class TestListaLigada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("Jonatas");
		System.out.println(lista);
		
		lista.adicionaNoComeco("Paulo");
		System.out.println(lista);
		
		lista.adicionaNoComeco("Guilherme");
		System.out.println(lista);
		
		lista.adiciona("Marcelo");
		System.out.println(lista);
		
		lista.adiciona(2, "Gabriel");
		System.out.println(lista);
		
		lista.removeDoComeco();
		System.out.println(lista);
	}

}
