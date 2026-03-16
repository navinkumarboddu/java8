package com.java8.practice.dsa.search.binary;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arr = {345,234,210,197,153,135,95,87,76,53,35,21,16,7,4,1};
        System.out.println(orderAgnosticBinarySearch(arr,21));
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find order of array
        boolean asc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            // 1,2,3,4,5,6,7,8,9
            if(asc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
            //9,8,7,6,5,4,3,2,1
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
