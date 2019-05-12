package com.fila;

import java.util.LinkedList;
import java.util.List;

public class Queue {

	private List<String> queue = new LinkedList<String>();

	public void enqueue(String element) {
		queue.add(element);
	}

	public String dequeue() {
		return queue.remove(0);
	}

	public String peek() {
		return queue.get(0);
	}

	public boolean isEmpty() {
		return queue.size() == 0;
	}

	public int size() {
		return queue.size();
	}

	@Override
	public String toString() {
		return queue.toString();
	}

	public void clear() {
		queue.clear();
	}
}
