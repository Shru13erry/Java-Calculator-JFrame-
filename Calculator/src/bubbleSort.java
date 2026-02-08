

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YX LOH
 */
public class bubbleSort<E>{
    
    public static void main(String[] args) {
            Integer[] list = {123,5,3,76};
      bubbleSort(list);
        for(int i : list){
            System.out.print(i + " ");
        }
    }
    
    public static <E extends Comparable<E>> void bubbleSort(E[] list){
        for(int i = 0; i<list.length-1; i++){
            for(int j = 0; j<list.length-1; j++){
                if(list[j].compareTo(list[j+1])>0){
                    E temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
}
