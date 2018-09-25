package com.tec.resources.dataStructures.Queue;

public class QueueExecutable {
	
	public static void main(String[] args) {
		Queue<String> cola = new Queue<>();
		cola.enqueue("A");
		cola.enqueue("B");
		cola.enqueue("C");
		System.out.println(cola.toString());
		
		cola.dequeue();
		System.out.println(cola.toString());
		
		cola.peek();
		System.out.println(cola.toString());
	}
}
