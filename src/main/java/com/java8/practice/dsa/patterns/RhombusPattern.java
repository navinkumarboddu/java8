package com.java8.practice.dsa.patterns;


/*
https://www.geeksforgeeks.org/java/java-pattern-programs/

* * * *
1* * * *
12* * * *
123* * * *
1234* * * *
 */
public class RhombusPattern {

    public static void main(String[] args) {
        pattern(5);
        printPattern(5);
    }

    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            int totalColsInRow = n-1;
            int spaces = i-1;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern(int n)
    {
        System.out.println("Navin");

        int i, j;
        int num = 1;

        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {

            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
