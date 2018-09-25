// Bibliotecas
package com.tec.resources.dataStructures.Queue;
import com.tec.resources.dataStructures.linkedList.*;

/**
 * <H2>Queue</H2>
 * <p> Cola de espera (FIFO) 
 * Soporta 3 operacione: Enqueue -- insertar al final | Dequeue-- Sacar del inicio
 * | Peek -- Obtener el primero(Sin sacarlo de la cola)</p>
 *
 */
public class Queue<T> {
	
	private LinkedList<T> list;
	
	
	public LinkedList<T> getList() {
		return list;
	}

	public void setList(LinkedList<T> list) {
		this.list = list;
	}

	/**
	 * <h2>Queue</h2>
	 * Inicializa la cola, creando la lista.
	 */
	public Queue() {
		this.list = new LinkedList<>();
	}
	
	/**
	 * <h2>Enqueue</h2>
	 * Inserta el elemento al final de la cola
	 * @param data Objeto que será insertado en la lista.
	 */
	public void enqueue(T data) {
		list.add(data);
	}
	
	/**
	 <h2>Dequeue</h2>
	 * Exporta el elemento inicial de la cola
	 * @return El primer elemento de la cola
	 */
	public T dequeue() {
		T out = list.get(0);
		list.remove(0);
		return out;
		
	}
	
	/**
	 <h2>Peek</h2>
	 * Retorna el elemento inicial de la cola
	 * @return El primer elemento de la cola
	 */
	public T peek() {
		return list.get(0);
	}
	
	@Override
	public String toString() {
		return this.list.showList();
	}
}
