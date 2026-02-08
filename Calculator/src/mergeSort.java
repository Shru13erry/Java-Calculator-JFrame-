/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

/**
 *
 * @author YX LOH
 */
public class mergeSort<E> {

    public static void main(String[] args) {
        Integer[] list = {123, 5, 3, 76};
        mergeSort(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static <E extends Comparable<E>> void mergeSort(E[] list) {

        if (list.length <= 1) {
            return;
        }

        int firstHalfLength = list.length / 2;
        E[] firstHalf = Arrays.copyOfRange(list, 0, firstHalfLength);
        mergeSort(firstHalf);

        E[] secondHalf = Arrays.copyOfRange(list, firstHalfLength, list.length);
        mergeSort(secondHalf);

        merge(firstHalf, secondHalf, list);
    }

    public static <E extends Comparable<E>> void merge(E[] firstHalf, E[] secondHalf, E[] list) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < firstHalf.length && current2 < secondHalf.length) {
            if (firstHalf[current1].compareTo(secondHalf[current2]) < 0) {
                list[current3++] = firstHalf[current1++];
            } else {
                list[current3++] = secondHalf[current2++];
            }
        }

        while (current1 < firstHalf.length) {
            list[current3++] = firstHalf[current1++];
        }
        while (current2 < secondHalf.length) {
            list[current3++] = secondHalf[current2++];
        }

    }
}
