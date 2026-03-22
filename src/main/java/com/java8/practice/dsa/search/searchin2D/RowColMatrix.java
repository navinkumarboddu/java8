package com.java8.practice.dsa.search.searchin2D;

import java.util.Arrays;

public class RowColMatrix {

    public static void main(String[] args) {
        int[][] arr = new int[][]
                {
  {2,  5,  9,  14},
  {4,  6, 12,  18},
  {7, 10, 15,  22},
  {11,13, 19,  30}
};
    int target = 10;
        System.out.println(Arrays.toString(rowcolSearch(arr,target)));
    }

    public static int[] rowcolSearch(int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;

        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            } else if (arr[row][col] > target) {
                col--;
            } else if (arr[row][col] < target) {
                row++;
            }
        }

        return new int[]{-1,-1};
    }
}
