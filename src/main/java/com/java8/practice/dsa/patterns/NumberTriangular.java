package com.java8.practice.dsa.patterns;

/*
https://www.geeksforgeeks.org/java/java-pattern-programs/
 */
public class NumberTriangular {

    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            int totalColsInRow = row;
            int spaces = n - totalColsInRow;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print(row + " ");
            }
            System.out.println(" ");
        }
    }
}
