package com.tec.resources.dataStructures.Stack;

public class StackExecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> MyStack = new Stack<>();
		
		for(int i = 0; i < 10; i++) {
			MyStack.push(i);
		}
		
		// Notese el orden de los números en la pila
		System.out.println(MyStack.getInnerList().showList());
		
		// Pop de los primeros 5 elementos de la pila
		for(int i = 0; i < 5; i++) {
			Integer tmp = MyStack.pop();
			System.out.println("+Pop:"+tmp);
			System.out.println(">>"+MyStack.getInnerList().showList());
		}

		// Peek de la pila
		Integer tmp = MyStack.peek();
		System.out.println("+Peek:"+tmp);
		System.out.println(">>"+MyStack.getInnerList().showList());
		
	}

}
