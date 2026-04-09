package com.java8.practice.dsa.recursion;

import java.util.Scanner;

public class NthFibonacciNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fibo(n));
    }

    static int fibo(int n){
        if (n < 2) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    //0,1,2,3,4,5,6
    //0,1,1,2,3,5,8
}
