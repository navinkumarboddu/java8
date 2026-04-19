package com.java8.practice.dsa.recursion;

import java.util.ArrayList;

public class SearchnReturnList {

    public static void main(String[] args) {
        int []arr = {2,3,5,6,8,5,12,10,15};
        int target = 5;
        ArrayList<Integer> list = new ArrayList<>();
        list = search(arr,target,0,list);
        list.forEach(System.out::println);

        findAllIndex(arr,target,0).forEach(System.out::println);
    }

    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> result = findAllIndex(arr,target,index+1);
        list.addAll(result);
        return list;
    }

    private static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index==arr.length){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }
        index++;
        return search(arr,target,index,list);
    }
}
