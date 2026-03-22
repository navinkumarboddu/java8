package com.java8.practice.dsa.search.searchin2D;

public class LinearSearch {

    public static void main(String[] args) {
        int[][] arr = {
                {18,9,12,},
                {36,-4,91},
                {44,33,16}
        };

        int target = 91;
        int[] result = search(arr, target);

        if (result[0] != -1){
            System.out.println("Found " + target + " at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Not Found...");
        }
    }

    private static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i].length - 1);
            for (int j = 0; j < arr[i].length; j++) {
                //System.out.println("Index i:" + i + ", j:" + j + " - " + arr[i][j]);
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
