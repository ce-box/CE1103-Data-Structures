package com.tec.GoS.Server.utilSorts;

// Bibliotecas
import com.tec.GoS.DataStructures.SimpleList.*;

/**
 * Clase utlitaria que contiene algoritmos de ordenamiento para la SimpleList<E>
 */
public class SortingAlgs {



  public static void main(String[] args) {

  }
  //-------------------------- INICIO DEL CODIGO --------------------------------------
	/**
	 * Algoritmo de ordenamiento Selection Sort
	 * + Recibe una Lista Simple y la retorna ordenada
	 * @param <E>
	 * @param list - Lista Simple a ordenar
	 * @return
	 */
	public static <E extends Comparable<E>> SimpleList<E> selectionSort(SimpleList<E> list){

        for (int i = 0; i < list.getLength() - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < list.getLength(); j++)
                // El Comparable < 0 significa que es menor.
                if (list.getAt(j).compareTo(list.getAt(index)) < 0)
                    index = j;

            E smallerNumber = list.getAt(index);
            list.getNode(index).setData(list.getAt(i));
            list.getNode(i).setData(smallerNumber);
        }
        logger.debug("Sorted List");
        return list;
    }

	/**
	 * Algoritmo de ordenamiento Insertion Sort
	 * + Recibe una Lista Simple y la retorna ordenada
	 * @param <E>
	 * @param list - Lista Simple a ordenar
	 * @return
	 */
	public static <E extends Comparable<E>> SimpleList<E> insertionSort(SimpleList<E> list){


        E temp;
        for (int i = 1; i < list.getLength(); i++) {
            for(int j = i ; j > 0 ; j--){
                if(list.getAt(j).compareTo(list.getAt(j-1)) < 0){
                    temp = list.getAt(j);
                    list.getNode(j).setData(list.getAt(j-1));
                    list.getNode(j-1).setData(temp);
                }
            }
        }
        return list;
    }

    /**
     * Metodo que ordena una lista simple mediante el algoritmo QuickSort
     * @param list - Lista a ordenar
     */
    public static  <E extends Comparable<E>> void quickSort(SimpleList<E> list){
      quickSort(list,0,list.getLength()-1);
    }

    /**
     * Metodo encargado de ordenar la lista
     * @param list - Lista a ordenar
     * @param low - indice menor
     * @param high - indice mayor
     */
    private static <E extends Comparable<E>> void quickSort(SimpleList<E> list, int low, int high){

      if(low < high){
        int pi = partition(list, low, high);
        quickSort(list, low, pi-1);
        quickSort(list, pi+1, high);
      }
    }

    /**
     * Metodo encargado de brindar el pivote
     * @param list - Lista a ordenar
     * @param low - indice menor
     * @param high - indice mayor
     * @@return numero de pivote, para realizar la particion
     */
    private static <E extends Comparable<E>> int partition(SimpleList<E> list, int low, int high){
      E pivot = list.getAt(high);
      int i = (low - 1);

      for(int j = low; j < high; j++){
        if(list.getAt(j).compareTo(pivot) < 0 || list.getAt(j).equals(pivot)){
          i++;
          E tmp = list.getAt(i);
          list.getNode(i).setData(list.getAt(j));
          list.getNode(j).setData(tmp);
        }
      }

      E tmp = list.getAt(i+1);
      list.getNode(i+1).setData(list.getAt(high));
      list.getNode(high).setData(tmp);
      return i+1;
    }

  //-------------------------- FINAL DEL CODIGO --------------------------------------
}
