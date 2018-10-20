package com.tec.GoS.DataStructures.BinaryTree;

/**
 * Clase nodo de arbol binario
 * @author Rocket Team
 * @version 0.3
 *
 * @param <E> dato generico
 */
public class Node <E> {

	// Atributos
	private E data;
	private Node<E> right;
	private Node<E> left;

	/**
	 * Constructor publico
	 * @param data - Dato del nodo
	 */
	public Node(E data) {
		this(data, null, null);
	}

	/**
	 * Constructor privado
	 * @param data Dato del nodo
	 * @param left Hijo Izquierdo
	 * @param right Hijo derecho
	 */
	private Node(E data, Node<E> left, Node<E> right ) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	// GETTERS
	public E getData() {
		return data;
	}

	public Node<E> getLeft() {
		return left;
	}

	public Node<E> getRight() {
		return right;
	}

	//SETTERS
	public void setData(E data) {
		this.data = data;
	}

	public void setRight(Node<E> right) {
		this.right = right;
	}

	public void setLeft(Node<E> left) {
		this.left = left;
	}
}
