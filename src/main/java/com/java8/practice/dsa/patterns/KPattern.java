package com.java8.practice.dsa.patterns;

/*
https://www.geeksforgeeks.org/java/java-pattern-programs/
 */
public class KPattern {

    public static void main(String[] args) {
        pattern(4);
    }

    //
    /*
    1* * * *
    2* * *
    3* *
    4*
    2 5 - 4 + 1
    3 6 - 4 + 1
    4 7 - 4 + 1
     */
    //

    static void pattern(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            int totalColsInRow = row >= 4 ? row - n + 1 : n - row + 1;
            for (int j = 1; j <= totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
