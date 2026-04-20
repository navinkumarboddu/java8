package com.java8.practice.dsa.sorting;

import java.util.Arrays;

public class SelectionSortRecursion {

    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{4,5,2,3,1};
        selectionSortRec(arr,0);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{4,5,2,3,1};
        slsort(arr, arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    public static void selectionSortRec(int[] arr,int start){
            int n = arr.length;

            if (start >= n - 1)
                return;

            int minIndex = findMinIndex(arr, start, n);

            int temp = arr[start];
            arr[start] = arr[minIndex];
            arr[minIndex] = temp;

            selectionSortRec(arr, start + 1);
        }

    private static int findMinIndex(int[] arr, int start, int n) {
        int minIndex = start;
        for (int i = start; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void slsort(int[] arr, int r, int c, int max) {
        if (r == 0)
            return;

        if(c<r) {
            if(arr[c] > arr[max]) {
                slsort(arr,r,c+1,c);
            } else {
                slsort(arr,r,c+1,max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            slsort(arr,r-1,0,0);
        }
    }
}
