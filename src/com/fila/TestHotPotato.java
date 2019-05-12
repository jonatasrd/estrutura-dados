package com.fila;

public class TestHotPotato {

	public static void main(String[] args) {
		
		HotPotato hotPotato = new HotPotato();
		
		String[] names = {"John", "Jack", "Camila", "Ingrid", "Carl"};
		
		hotPotato.play(names, 7);
	}
}
