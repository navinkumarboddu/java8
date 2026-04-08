package com.java8.practice.dsa.patterns;

public class Pattern9 {

    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        int original = n ;
        n = 2 * n - 2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int valAtIndex = original - Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(valAtIndex + " ");
            }
            System.out.println("");
        }
    }
}
