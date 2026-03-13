package com.java8.practice.dsa;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to be reversed : ");

        int n = s.nextInt();
        int rev = 0;

        //123
        // 123 mod 10 = 3 -> 123/10 = 12 -> 3*10 = 30
        // 12 mod 10 = 2 -> 12/10 = 1  ->
        // 1 mod 10 = 1 -> 1/10 = 0

        while(n>0){
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }

        System.out.println("Reverse Number :" + rev);
    }
}
