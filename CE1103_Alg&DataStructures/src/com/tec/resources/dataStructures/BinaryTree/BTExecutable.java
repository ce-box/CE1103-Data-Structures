package com.tec.resources.dataStructures.BinaryTree;

public class BTExecutable {
	
	public static void main(String[] args) {
		BinaryTree<Integer> BT = new BinaryTree<>();
		
		System.out.println(BT.isEmpty());
		
		// Se agregan elementos al arbol
		BT.insert(10);
		BT.insert(2);
		
		// Se pide el mayor y el menor
		System.out.println(BT.findMin().getData());
		System.out.println(BT.findMax().getData());
		
		// Se agregan más elementos al arbol
		BT.insert(-6);
		BT.insert(20);
		
		// Se pide el mayor y el menor
		System.out.println(BT.findMin().getData());
		System.out.println(BT.findMax().getData());
		
		// Se elimina un elemento del árbol
		BT.remove(20);
		
		// Se pide el mayor y el menor
		System.out.println(BT.findMin().getData());
		System.out.println(BT.findMax().getData());
		
	}
}
