package com.java8.practice;

import java.util.Scanner;

public class MaxInArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter data in array index:" + (i+1));
            arr[i] = in.nextInt();
        }
        System.out.println("Max in array:" + max(arr));
    }

    private static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
