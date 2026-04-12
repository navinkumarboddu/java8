package com.java8.practice.dsa.patterns;

/*
https://www.geeksforgeeks.org/java/java-pattern-programs/
1 2 3 4
1 2 3
1 2
1
 */

public class NumberIncreasingReversePyramid {

    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
