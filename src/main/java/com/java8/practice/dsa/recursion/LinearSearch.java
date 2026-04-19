package com.java8.practice.dsa.recursion;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {2,5,7,9,13,17,19,35,47};
        int pos = linearSearch(arr,47,0);
        System.out.println(pos);
    }

    public static int linearSearch(int[] arr,int key,int pos){
        if(pos==arr.length-1){
            if(key==arr[pos]){
                return pos;
            }
            return -1;
        }
        if(key==arr[pos]){
            return pos;
        }
        return linearSearch(arr,key,pos+1);
    }
}
