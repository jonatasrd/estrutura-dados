package com.fila;

import java.util.ArrayList;
import java.util.List;

public class HotPotato {

	private Queue queue = new Queue();
	private List<String> elimitated = new ArrayList<>();

	public void play(String elements[], int num) {

		for (int i = 0; i < elements.length; i++) {
			queue.enqueue(elements[i]);
		}

		while (queue.size() > 1) {

			for (int i = 0; i < num; i++) {
				queue.enqueue(queue.dequeue());
			}

			elimitated.add(queue.dequeue());
		}

		elimitated.forEach(element -> {
			System.out.println(element + " was eliminated.");
		});
		System.out.println("Winner is " + queue.dequeue());
	}
}
