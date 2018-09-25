package com.tec.resources.dataStructures.Stack;

// Libraries
import com.tec.resources.dataStructures.linkedList.LinkedList;

/**
 * <h2> Stack/Pila </h2>
 * Una <b>pila</b> es una lista ordenada o estructura de datos que permite almacenar y recuperar datos,
 * el modo de acceso a sus elementos es de tipo LIFO.(Last Input First Output) 
 * @author Esteban Alvarado Vargas
 *
 * @param <E> Tipo de dato que soporta la Pila
 */
public class Stack<E> {
	
	private LinkedList<E> innerList;
	
	/**
	 * Constructor de una Pila vacía
	 */
	public Stack() {
		this.innerList = new LinkedList<>();
	}
	
	/**
	 * Inserta un elemento en el tope
	 * @param element
	 */
	public void push(E element) {
		this.innerList.addFirst(element);
	}
	
	/**
	 * Saca el elemento del tope
	 * @return Elemento en el tope
	 */
	public E pop() {
		E top = this.innerList.get(0);
		this.innerList.remove(0);
		return top;
	}
	
	/**
	 * Obtiene el elemento sin sacarlo de la pila
	 * @return Elemento en el tope
	 */
	public E peek() {
		E top = this.innerList.get(0);
		return top;
	}

	public LinkedList<E> getInnerList() {
		return innerList;
	}
	
	
}
