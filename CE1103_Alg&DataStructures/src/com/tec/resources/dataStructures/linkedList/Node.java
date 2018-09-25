package com.tec.resources.dataStructures.linkedList;

/**
 * Un nodo es un objeto independiente y din�mico. Debe poseer al menos dos atributos:
 * Un valor y un nodo siguiente.
 * @author Esteban Alvarado Vargas
 * @param T - Tipo del dato que soportar� el Nodo.
 * @version 4/08/2018
 */
public class Node <T>{
	
	protected T data;
	protected Node <T> next;
	
	/** Constructor de un Nodo.
	 * @param data - elemento que se guardar� en el nodo.
	 */
	public Node(T data){
		this(data,null);
	}
	
	/** 
	 * Constructor de un Nodo. Recibe dos par�metros dato y nodo siguiente.
	 * @param data - elemento que se guardar� en el nodo.
	 * @param next - Valor del nodo siguiente.
	 */
	private Node(T data, Node <T> next){
		this.data = data;
		this.next = next;
	
	}
}
