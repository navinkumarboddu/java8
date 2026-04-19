package com.java8.practice.dsa.recursion;

public class SortedArrayCheck {

    public static void main(String[] args) {
        int arr[] = {2,3,5,6,8,12,10,15};
        System.out.println(sortCheck(arr,0));
    }

    private static boolean sortCheck(int[] arr, int index) {
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sortCheck(arr, index+1);
    }
}
