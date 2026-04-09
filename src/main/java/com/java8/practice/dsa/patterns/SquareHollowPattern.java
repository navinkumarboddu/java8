package com.java8.practice.dsa.patterns;

/*
https://www.geeksforgeeks.org/java/java-pattern-programs/
 */
public class SquareHollowPattern {

    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            int totalColsInRow = row == n || row == 1 ? n : 2;
            int spaces = n - totalColsInRow;
            if (spaces == 0) {
                for (int cols = 0; cols < totalColsInRow; cols++) {
                    System.out.print("* ");
                }
            } else if (totalColsInRow != n && spaces > 0){
                System.out.print("* ");
                for (int space = 0; space < spaces; space++) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
