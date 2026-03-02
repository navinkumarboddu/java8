package com.java8.practice.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    /*
    Given an array, sort the array using Selection Sort algorithm.

    Example- Consider the array:
    12, 35, 87, 26, 9, 28, 7
     - run for loop from i = 0 index to len -1
     - find min value by comparing
     - store the minIndex
     - run loop from j = i + 1 to len
     - swap the startIndex and minIndex

    sorted:
    7, 9, 12, 26, 28, 35, 87
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array to be sorted:");
        int len = s.nextInt();
        int[] a = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.println("Enter the element:");
            a[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(a));

        selectionSort(a);
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[minIndex] > a[j]){
                    minIndex = j;
                }
            }
            if( i != minIndex && a[i] != a[minIndex]){
                swap(a, i, minIndex);
            }
            System.out.println("Iteration count:" + i);
            System.out.println(Arrays.toString(a));
        }
    }

    private static void swap(int[] a, int startIndex, int minIndex) {
        int temp = a[startIndex];
        a[startIndex] = a[minIndex];
        a[minIndex] = temp;
    }
}
