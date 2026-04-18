package com.java8.practice.dsa.recursion;

import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(getSumOfDigits(n));
    }

    private static int getSumOfDigits(int n) {
        if(n == 0){
            return 0;
        }
        return (n%10)+getSumOfDigits(n/10);
    }
}
