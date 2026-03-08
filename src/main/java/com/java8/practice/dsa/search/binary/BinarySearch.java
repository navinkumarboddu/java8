package com.java8.practice.dsa.search.binary;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,5,7,8,23,35,57,78,99,153};
                   //0,1,2,3,4,  5, 6, 7, 8, 9
        System.out.println(binarySearch(arr,35));

        System.out.println(implementBinarySearch(arr,35));
    }

    private static int implementBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    // 0 9 4
    // 5 9 7
    // 5 6 5

    //return the index
    //return -1, if does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int res = Integer.MIN_VALUE;
        while(start <= end){
            int mid = start + (end - start)/2;
            System.out.println("Start:" + start);
            System.out.println("End: " + end);
            System.out.println("Mid: " + mid);
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
