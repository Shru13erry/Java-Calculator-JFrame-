/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YX LOH
 */
public class selectionSort<E>{
    
    public static <E extends Comparable<E>> void selectionSort(E[] list){
       for(int i = 0; i<list.length-1; i++){
           E currentMin = list[i];
           int currentMinIndex = i;
           for(int j = i+1; j<list.length; j++){
               if(list[j].compareTo(currentMin)<0){
                   currentMin = list[j];
                   currentMinIndex = j;
               }
           }
           if(currentMinIndex!=i){
               E temp = list[i];
               list[i] = list[currentMinIndex];
               list[currentMinIndex] = temp;
           }
       } 
    }
    
    public static void main(String[] args) {
        Integer[] list = {123,5,3,76};
        selectionSort(list);
        for(int i : list){
            System.out.print(i + " ");
        }
    }
    
    
}
