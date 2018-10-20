package com.tec.GoS.DataStructures.SimpleList;

/**
 * Clase Nodo de lista SimpleDoc
 * + Permite almacenar datos genericos
 * @author Rocket Team
 */
public class Node<E extends Comparable<E>>{

  // Atributos
  protected E data;
  protected Node<E> next;

  /**
   * Constructor de un nuevo nodo
   * @param data - Dato que soporta el Nodo de la lista Simple
   */
  public Node(E data){
    this(data,null);
  }

  /**
   * Constructor PRIVADO de un nuevo nodo
   * @param data - Dato que soporta el Nodo de la lista Simple
   * @param next - Nodo sgte
   */
  private Node(E data, Node<E> next){
    this.data = data;
    this.next = next;
  }

  /**
   * Retorna el dato del nodo
   * @return Dato almacenado en el nodo
   */
  public E getData(){
    return this.data;
  }

  /**
   * Permite asignar el dato del nodo
   * @param data Dato a almacenar en el nodo
   */
  public void setData(E data){
    this.data = data;
  }

}
