package com.java8.practice.dsa.patterns;

public class Pattern6 {

    public static void main(String[] args) {
        //pattern(5);
        pattern3(5);
    }

    static void pattern3(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            int totalColsInRow = row > 5 ? 2*n - row : row;
            int spaces = n - totalColsInRow;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }



















    static void pattern(int n){
        for (int row = 1; row <= 2*n-1; row++) {
            int totalColsInRow = row > 5 ? 2*n-row : row;
            int spaces = n - totalColsInRow;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
}
