package com.java8.practice.dsa.patterns;

/*
https://www.geeksforgeeks.org/java/java-pattern-programs/
 */
public class NumberChangingPyramid {

    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {
        int count = 1;
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
