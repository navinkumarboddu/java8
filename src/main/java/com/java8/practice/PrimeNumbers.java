package com.java8.practice;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number::");
        int n = in.nextInt();
        System.out.println(checkPrime(n) ? "Prime":"Not Prime");
    }

    private static boolean checkPrime(int n) {
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
