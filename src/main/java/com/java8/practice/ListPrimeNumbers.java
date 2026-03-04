package com.java8.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPrimeNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of Prime numbers to listed:");
        int n = in.nextInt();
        printPrimeNumbers(n);
    }

    private static void printPrimeNumbers(int n) {
        int count = 0;
        int number = 2;
        while(count < n){
            if(checkPrime(number)){
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    private static boolean checkPrime(int n) {
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }


}
