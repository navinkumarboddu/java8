package com.java8.practice.dsa.patterns;

public class Pattern8 {

    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        for (int row = 1; row <= 2*n; row++) {
            int totalColsInRow = row > n ? 2*n - row : row;
            int spaces = n - totalColsInRow;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int col = totalColsInRow; col >=1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col<=totalColsInRow ; col++) {
                System.out.print(col);
            }
            System.out.println(" ");
        }
    }
}
