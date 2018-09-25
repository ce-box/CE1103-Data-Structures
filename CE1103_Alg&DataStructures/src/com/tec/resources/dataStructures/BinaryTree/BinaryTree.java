package com.tec.resources.dataStructures.BinaryTree;

/**
 * Es un árbol donde cada nodo tiene a lo sumo dos hijos: uno a la derecha y otro a la izquierda
 * @author Esteban Alvarado
 *
 * @param <E>
 */
public class BinaryTree<E extends Comparable<E>> {
	
	private Node<E> root;
	
	// Métodos de comparación 
	/**
	 * 
	 * @param element1
	 * @param element2
	 * @return
	 */
	private boolean greaterThan(E element1,E element2 ) {
		return element1.compareTo(element2) == 1;
	}
	
	/**
	 * 
	 * @param element1
	 * @param element2
	 * @return
	 */
	private boolean lowerThan(E element1,E element2 ) {
		return element1.compareTo(element2) == -1;
	}
	
	//-----------------------------------------------------
	
	/**
	 * Constructor de un árbol vacío 
	 */
	public BinaryTree(){
		this.root = null;
	}
	
	/**
	 * Indica si el arbol está vacío
	 * @return
	 */
	public boolean isEmpty() {
		return this.root == null;
	}
	
	//-------------------------------------------------------
	// INSERTAR ELEMENTOS
	
	/**
	 * 
	 * @param data
	 */
	public void insert(E data) {
		this.root = this.insert(data,this.root);
	}
	
	/**
	 * 
	 * @param data
	 * @param current
	 * @return
	 */
	private Node<E> insert(E data,Node<E> current){
		if(current == null) {
			return new Node<E>(data,null,null);
		}
		else if(lowerThan(data, current.getData())) {
			current.setLeft(this.insert(data, current.getLeft()));
		}
		else if(greaterThan(data, current.getData())) {
			current.setRight(this.insert(data, current.getRight()));
		}
		return current;
	}
	
	//-------------------------------------------------------
	// ELIMINAR ELEMENTOS
	
	public Node<E> remove(E data) {
		return remove(data,this.root);
	}
	
	private Node<E> remove(E data, Node<E> node) {
		if(node == null) {
			return null;
		}
		else if(greaterThan(data, node.getData())) {
			node.setRight(remove(data,node.getRight()));
		}
		else if(lowerThan(data, node.getData())) {
			node.setLeft(remove(data,node.getLeft()));
		}
		else if(node.getLeft() != null && node.getRight() != null) {
			node.setData(findMin(node.getRight()).getData());
			node.setRight(remove(node.getData(),node.getRight()));
		}
		else {
			node = node.getLeft() != null ? node.getLeft():node.getRight();
		}
		return node;
	}
	
	//-----------------------------------------------------
	// Métodos de BÚSQUEDA
	
	/**
	 * 
	 * @param data
	 * @return
	 */
	public boolean contains(E data) {
		return this.contains(data,this.root);
	}
	
	/**
	 * 
	 * @param data
	 * @param node
	 * @return
	 */
	public boolean contains(E data,Node<E> node) {
		
		if(node == null) {
			return false;
		}
		// El dato es menor que <...
		else if(lowerThan(data,node.getData())) {
			return contains(data,node.getLeft());
		}
		// El dato es mayor que >...
		else if(greaterThan(data, node.getData())) {
			return contains(data,node.getRight());
		}else {
			return true; 
		}
	
	}
	
	// Encontrar el MENOR elemento del árbol
	
	/**
	 * 
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
	 * 
	 * @param node
	 * @return
	 */
	private Node<E> findMin(Node<E> node){
		if(node == null) {
			return null;
		}
		else if(node.getLeft() == null) {
			return node;
		}
		else {
			return findMin(node.getLeft());
		}
	}
	
	// Encontrar el MAYOR elemento del árbol
	
	/**
	 * 
	 * @return
	 */
	public Node<E> findMax(){
		
		if(this.isEmpty()) {
			return null;
		}
		else {
			return findMax(this.root);
		}
	}
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	private Node<E> findMax(Node<E> node){
		if(node == null) {
			return null;
		}
		else if(node.getRight() == null) {
			return node;
		}
		else {
			return findMin(node.getRight());
		}
	}
	
	
	
	

}
