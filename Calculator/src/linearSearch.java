/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YX LOH
 */
public class linearSearch<E>{
    
    public static <E extends Comparable<E>> E linearSearch(E[] list, E searchkey){
        for(int i = 0; i<list.length; i++){
            if(list[i].compareTo(searchkey)==0){
                return list[i];
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        Integer[] list = {123, 5, 3, 76};
        Integer searchkey = 1;
        if(linearSearch(list,searchkey)==null){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found");
        }
    }
}
