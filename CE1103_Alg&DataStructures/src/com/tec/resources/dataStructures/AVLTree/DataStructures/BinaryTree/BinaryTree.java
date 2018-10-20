package com.tec.GoS.DataStructures.BinaryTree;

/**
 * Arbol Binario de busqueda
 */
public class BinaryTree<E extends Comparable<E>> {

	// Atributos
	private Node<E> root;

	// Constructor
	/**
	 * Constructor de un arbol vacio
	 */
	public BinaryTree() {
		this.root = null;
	}

	//---------------------------------------

	/**
	 * Indica si el arbol esta vacio
	 * @return
	 */
	public boolean isEmpty() {
		return this.root == null;
	}

	//--------------------------------------

	// Metodos de insercion
	/**
	 * Inserta un elemento en el arbol Binario
	 * @param data
	 */
	public void insert(E data) {
		this.root = this.insert(data, this.root);
	}

	/**
	 * Metodo recursivo que busca donde insertar el nodo
	 * @param data
	 * @param current
	 * @return
	 */
	private Node<E> insert(E data,Node<E> current){
		if (current == null) {
			return new Node<E>(data);
		}
		else if (data.compareTo(current.getData()) < 0 ) {
			current.setLeft(this.insert(data, current.getLeft()));
		}
		else if (data.compareTo(current.getData()) > 0) {
			current.setRight(this.insert(data, current.getRight()));
		}
		return current;
	}

	//--------------------------------------

	// Metodos de busqueda en el arbol

	// Encontrar el menor

	/**
	 * Retorna el menor elemento del arbol
	 * @return
	 */
	public Node<E> findMin(){
		if(this.isEmpty()) {
			return null;
		}
		else {
			return findMin(this.root);
		}
	}

	/**
	 * Retorna el menor elemento a partir de un nodo dado
	 * @param current
	 * @return
	 */
	private Node<E> findMin(Node<E> current){
		if(current == null) {
			return null;
		}
		else if (current.getLeft() == null) {
			return current;
		}
		else {
			return findMin(current.getLeft());
		}
	}

  // Encontrar el mayor

  public Node<E> findMax(){
    return findMax(this.root);
  }

  private Node<E> findMax(Node<E> current){
    if(current == null){
      return null;
    }
    else if(current.getRight() == null){
      return current;
    }
    else{
      return findMax(current.getRight());
    }
  }

	//-------------------------------------------

	// Metodos de eliminicacion

	public Node<E> remove(E data) {
		return remove(data,this.root);
	}

	private Node<E> remove(E data, Node<E> current){
		if(current == null) {
			return null;
		}
		else if(data.compareTo(current.getData()) < 0) {
			current.setLeft(remove(data, current.getLeft()));
			///current.left = remove(data, current.setLeft(current.getLeft()));
		}
		else if(data.compareTo(current.getData()) > 0) {
			current.setRight(remove(data, current.getRight()));
			///current.left = remove(data, current.setLeft(current.getLeft()));
		}
		else if(current.getLeft() != null && current.getRight() != null) {
			current.setData(findMin(current.getRight()).getData());
			current.setRight(remove(current.getData(), current.getRight()));
		}
    else{
      current = current.getLeft() != null ? current.getLeft():current.getRight();
    }
		return current;
	}
}
