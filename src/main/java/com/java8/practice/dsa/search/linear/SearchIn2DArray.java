package com.java8.practice.dsa.search.linear;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1,3,4},
                {34,67,56},
                {7,99,10}
        };

        for (int arr1[]:arr){
            System.out.println(Arrays.toString(arr1));
        }

        //System.out.println(search(arr,67));
        System.out.println(max(arr));
    }

    private static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int[] ints: arr){
            for(int element: ints){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }

    private static boolean search(int[][] arr, int target) {
        boolean found = false;
        for (int row = 0; row < arr.length-1; row++) {
            for (int col = 0; col < arr[row].length - 1; col++) {
                if(arr[row][col] == target){
                    found = true;
                }
            }
        }
        return found;
    }

    private static boolean searchForEach(int[][] arr, int target) {
        boolean found = false;
        for (int[] a: arr){
            for (int val:a){
                if(val == target){
                    found = true;
                }
            }
        }
        return found;
    }

}
