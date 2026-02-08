/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YX LOH
 */
public class binarySearch<E>{
    
    public static <E extends Comparable<E>> E binarySearch(E[] list, E searchkey){
        int high = (list.length-1)/2;
        int low = 0;
        int mid;
     
        for(int i = 0; i<list.length; i++){
            mid = (high+low)/2;
            if(searchkey.compareTo(list[mid])<0){
                high = mid - 1;
            }
            else if(searchkey.compareTo(list[mid])>0){
                low = mid + 1;
            }
            else{
                return list[mid];
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
       Integer[] list = {123,345,7645,3};
       Integer searchkey = 345;
       if(binarySearch(list,searchkey)==null){
           System.out.println("Not Found");
       }
       else{
           System.out.println("Found");
       }
    }
}
