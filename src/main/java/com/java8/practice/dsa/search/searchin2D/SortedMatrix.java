package com.java8.practice.dsa.search.searchin2D;

public class SortedMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {2, 5, 9, 14},
                {4, 6, 12, 18},
                {7, 10, 15, 22},
                {11, 13, 19, 30}
        };

        int target = 15;

        int[] result = search(matrix, target);

        System.out.println("Row: " + result[0] + ", Col: " + result[1]);
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // Reduce rows to 2
        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }

            if(matrix[mid][cMid] < target){
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Check middle column of 2 remaining rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }

        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }

        // Search in 4 parts

        // 1st half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }

        // 2nd half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        // 3rd half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }

        // 4th half
        else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

    static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if(arr[row][mid] == target){
                return new int[]{row, mid};
            }

            if(arr[row][mid] < target){
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
