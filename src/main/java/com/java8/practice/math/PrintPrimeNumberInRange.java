package com.java8.practice.math;

import java.util.Scanner;

public class PrintPrimeNumberInRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number until which you want to print prime numbers: ");
        int n = input.nextInt();

        printPrimeNumbers(n);
    }

    private static void printPrimeNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            if(checkPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    private static boolean checkPrime(int n) {
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        int c =2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
