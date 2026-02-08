


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YX LOH
 */
public class insertionSort<E>{
    
    public static <E extends Comparable<E>> void insertionSort(E[] list){
        for(int i = 1; i<list.length; i++){
            E currentMin = list[i];
            int k;
            for(k = i-1; k>=0 && list[k].compareTo(currentMin)>0 ; k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentMin;
        }
    }
    
    public static void main(String[] args) {
        Integer[] list = {123,5,3,76};
        insertionSort(list);
        for(int i : list){
            System.out.print(i + " ");
        }
    }
    
}

