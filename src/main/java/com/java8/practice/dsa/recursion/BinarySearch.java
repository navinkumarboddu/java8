package com.java8.practice.dsa.recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,5,7,9,13,17,19,35,47};
        int pos = search(arr,17,0, arr.length-1);
        System.out.println(pos);
    }

    static int search(int[] arr,int key, int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]==key){
            return mid;
        } else if(arr[mid]>key){
            return search(arr,key,start,mid-1);
        }
        return search(arr,key,mid+1,end);
    }
}
