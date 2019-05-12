package com.fila;

public class TestQueue {

	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.enqueue("Jonatas");
		queue.enqueue("Jaqueline");
		queue.enqueue("João");
		queue.enqueue("Maria");
		
		System.out.println(queue);
		
		queue.dequeue();
		
		System.out.println(queue);
		
		System.out.println("A lista tem o tamanho " + queue.size());
		
		queue.enqueue("Breine");
		queue.enqueue("Arya");
		queue.enqueue("John Snow");
		
		System.out.println(queue);
		
		System.out.println("Peek: " + queue.peek());
		
		System.out.println(queue.isEmpty() == true ? "Fila vazia" : "Fila não está vazia");
		
		System.out.println("Limpando a fila ...");
		
		queue.clear();
		
		System.out.println(queue.isEmpty() == true ? "Fila vazia" : "Fila não está vazia");
	}

}
