package com.java8.practice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {34,56,23,1,3,256,67};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArr(int[] arr) {
//        for (int i = 0; i < arr.length/2; i++) {
//            for (int j = arr.length-1; j > arr.length/2 ; j--) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
