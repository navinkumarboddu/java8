package com.java8.practice.dsa.search.linear;

public class FindMin {

    public static void main(String[] args) {
        int[] arr = {18,12,-7, 3, 14,21};
        System.out.println(min(arr));
    }

    private static int min(int[] arr) {
        int min = arr[0];
        int count = 1;
        while(count < arr.length-1) {
            if(arr[count] < min){
                min = arr[count];
            }
            count++;
        }
        return min;
    }
}
