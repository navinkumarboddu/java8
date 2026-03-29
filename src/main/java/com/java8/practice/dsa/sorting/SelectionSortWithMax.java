package com.java8.practice.dsa.sorting;

import java.util.Arrays;

public class SelectionSortWithMax {

    public static void main(String[] args) {
        int []arr = {4,5,1,2,3};
        selectionSort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0, last);
            swap(arr,maxIndex,last);
            //System.out.println("Iteration " + i);
            //Arrays.stream(arr).forEach(System.out::print);

        }
    }

    private static void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

    private static int getMaxIndex(int[] a, int startIndex, int endIndex) {
        int maxIndex = startIndex;
        for (int i = startIndex; i <= endIndex; i++) {
            if(a[maxIndex] < a[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
