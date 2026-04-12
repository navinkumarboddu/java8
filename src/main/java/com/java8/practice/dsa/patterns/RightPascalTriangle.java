package com.java8.practice.dsa.patterns;

/*
https://www.geeksforgeeks.org/java/java-pattern-programs/

    *
     *
    * *
     * *
    * *
     *
    *

 */
public class RightPascalTriangle {

    public static void main(String[] args) {
        pattern(4);
    }

    static void patternk(int n) {
        boolean print = false;
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            if (row % 2 == 0 && row != n) {
                totalColsInRow--;
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern(int n) {
        for (int row = 1; row < 2 * n; row++) {

            int totalColsInRow = row > n ? 2 * n - row : row;

            // shift even rows
            if (row % 2 == 0) {
                System.out.print(" ");
            }

            // remove extra star due to shift (except middle row)
            if (row % 2 == 0 && row != n) {
                totalColsInRow--;
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
