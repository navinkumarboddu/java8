package com.java8.practice.dsa.sorting;

import java.util.Arrays;

public class BubbleSortRecursion {

    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        bubbleSort(arr, arr.length,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int n, int i) {
        if(n==1){
            return;
        }

        if (i == n - 1) {
            bubbleSort(arr, n - 1, 0);
            return;
        }

        if(arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

        bubbleSort(arr,n,i+1);
    }


}
