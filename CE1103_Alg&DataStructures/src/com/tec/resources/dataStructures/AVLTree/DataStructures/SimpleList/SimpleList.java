package com.tec.GoS.DataStructures.SimpleList;

public class SimpleList <E extends Comparable<E>> {

  // Atributos
  private Node<E> head;
  private int length;

  public SimpleList(){
    this.head = null;
    this.length = 0;
  }

  /**
   * Indica si la lista se encuentra vacia
   * @@return Lista vacia ? true:false
   */
  private boolean isEmpty(){
    return this.head == null;
  }

  /**
   * Retorna el largo de la lista
   * @return Largo de la lista simple
   */
  public int getLength(){
    return this.length;
  }

  /**
   * Retorna el HEAD de la lista Simple.
   * @return Head Node
   */
  public Node<E> getHead(){
    return this.head;
  }

  //---------------------------------------------------------------------

  /**
   * Agrega un elemento al final de la lista
   * @param element - Elemento a insertar al final de la lista
   */
  public void addLast(E element){
    if (this.isEmpty()) {
      this.head = new Node<E>(element);
      this.length ++;
    }
    else{
      Node<E> tmp = this.head;

      while(tmp.next != null){
        tmp = tmp.next;
      }
      tmp.next = new Node<E> (element);
      this.length ++;
    }

  }

  /**
   * Inserta un dato especifico al inicio de la lista.
   * @param element - Elemento a insertar en el inicio de la lista
   */
  public void addFirst(E element ){
    Node<E> newElement = new Node<E>(element);
    newElement.next = this.head;
    this.head = newElement;
    this.length++;
  }

  /**
   * Inserta un elemento en la lista
   * @param element - Elemento a insertar en la lista
   */
  public void add(E element){
    this.addLast(element);
  }

  /**
   * Elimina un elemento en la lista
   * @param element - Elemento a eliminar de la lista
   */
  public boolean remove(E element){
    Node<E> aux= this.head, prev= null;
    boolean out = false;

    while(aux != null && !aux.data.equals(element)){
      prev = aux;
      aux = aux.next;
    }

    if(aux != null){
      out = true;
      this.length++;

      if(prev == null){
        this.head = aux.next;
      }
      else{
        prev.next = aux.next;
      }
    }

    return out;
  }

  /**
   * Elimina un elemento de la lista, dado su indice
   * @param index - Indice del elemento a eliminar de la lista
   */
  public boolean removeAt(int index){
    E element = this.getAt(index);
    return remove(element);
  }

  //-------------------------------------------------------------

  public E getAt(int index){

    Node<E> aux = this.head;
    int count = 0;
    E out = null;

    while(count != index){
      count++;
      aux = aux.next;
    }

    if(aux != null){
      out = aux.data;
    }

    return out;
  }

  /**
   * Retorna el Nodo dado un indice
   * @param index - Posicion del Nodo
   */
  public Node<E> getNode(int index){

    Node<E> aux = this.head;
    int count = 0;

    while(count != index){
      count++;
      aux = aux.next;
    }

    return aux;

  }

  /**
   * Retorna la lista como String
   */
  @Override
  public String toString(){

    String list = "";

    for(Node<E> aux = this.head; aux != null; aux = aux.next){
      list += aux.getData().toString();
      if(aux.next != null){
        list += ",";
      }
    }
    return "["+list+"]";
  }

  //----------------- FIN DEL CODIGO------------------------
}
