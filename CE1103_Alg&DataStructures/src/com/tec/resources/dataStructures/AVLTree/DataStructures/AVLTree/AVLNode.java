package com.tec.GoS.DataStructures.AVLTree;

/**
 * Clase Nodo para arbol AVL
 * @author Rocket Team
 * @version 1.1
 */
public class AVLNode <E extends Comparable<E>>{

  /* Atributos */
  private E data;
  private AVLNode<E> left;
  private AVLNode<E> right;
  private int height;

  /**
  * Construtor de AVLNode
  * @param data - dato a insertar en el arbol
  */
  public AVLNode(E data){

    this(data,null,null);
  }

  /**
   * Construtor de AVLNode
   * @param data - Dato a insertar en el arbol
   * @param left - Nodo izquierdo
   * @param right - Nodo derecho
   */
  public AVLNode(E data, AVLNode<E> left, AVLNode<E> right){
    this.data = data;
    this.left = left;
    this.right = right;
  }


  /**
   * Almacena la altura del nodo
   * @param height - Altura del nodo
   */
  public void setDepth(int height){
    this.height = height;
  }

  /**
   * Retorna la altura del nodo
   * @return La altura del Nodo
   */
  public int getDepth(){
    return this.height;
  }

  /**
   * Retorna el dato del nodo
   * @return dato del Nodo
   */
  public E getData() {
		return this.data;
	}

  /**
   * Almacena el dato del nodo
   * @param data - Dato almacenado en el nodo
   */
	public void setData(E data) {
		this.data = data;
	}

  /**
   * Retorna el nodo izquierdo
   * @return Nodo izquierdo
   */
	public AVLNode<E> getLeft() {
		return this.left;
	}

  /**
   * Almacena el nodo izquierdo
   * @param left - Nodo izquierdo del nodo
   */
  public void setLeft(AVLNode<E> left) {
		this.left = left;
	}

  /**
   * Retorna el nodo derecho
   * @return Nodo derecho
   */
	public AVLNode<E> getRight() {
		return this.right;
	}

  /**
   * Almacena el nodo derecho
   * @param right - Nodo derecho del nodo
   */
	public void setRight(AVLNode<E> right) {
		this.right = right;
	}

	@Override
	public String toString() {
    String out = String.format("Node{ data: %s}",this.data);
		return out;
	}


  //-------------FIN DEL CODIGO ---------------------
}
