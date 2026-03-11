package com.java8.practice.dsa.search.linear;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {23,45,19,23,47,67};
        int ans = linearSearch(nums, 19);
        System.out.println(ans);
    }

    //search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        int findIndex = -1;
        if(arr.length != 0) {
            for (int index = 0; index < arr.length - 1; index++) {
                //check for element is equal to target
                if (arr[index] == target) {
                    findIndex = index;
                }
            }
        }
        return findIndex;
    }
}
