package com.tec.GoS.DataStructures.AVLTree;

/**
 * @author Rocket Team
 * @version 0.1
 */
public interface Tree<E extends Comparable<E>>{

  /**
   * @param data El dato por insertar
   */
  void insert(E data);

  /**
   * @param dataToRemove El dato por eliminar
   */
  void remove(E dataToRemove);

  /**
   * Indica si el arbol esta vacio
   */
  boolean isEmpty();
}
