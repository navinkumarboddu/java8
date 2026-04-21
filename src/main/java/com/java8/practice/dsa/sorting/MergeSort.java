package com.java8.practice.dsa.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 5, 8, 4, 3, 2, 1,7,9,6 };
        mergeSortInPlace(arr,0,arr.length);
        Arrays.stream(arr).forEach(System.out::println);
    }

    static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                merged[k] = left[i];
                i++;
            } else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }

        //copy remaining elements
        while (i < left.length) {
            merged[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }

    static void mergeSortInPlace(int[] arr, int start, int end) {
        if(end - start == 1) {
            return;
        }

        int mid = (start + end)/ 2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start,mid,end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if(arr[i] <= arr[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            merged[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            merged[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < merged.length; l++) {
            arr[start+l] = merged[l];
        }
    }
}
