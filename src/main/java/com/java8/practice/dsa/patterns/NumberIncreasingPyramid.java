package com.java8.practice.dsa.patterns;

/*
https://www.geeksforgeeks.org/java/java-pattern-programs/
1
1 2
1 2 3
1 2 3 4
 */
public class NumberIncreasingPyramid {

    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }
    }
}
