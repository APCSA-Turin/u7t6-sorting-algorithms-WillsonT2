package com.example.project.Insertion_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrA = {23,11,10,26,20,5,13,8,30,25};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {23,11,10,26,20,5,13,8,30,25};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));

    }
}
