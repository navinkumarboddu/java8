package com.java8.practice;

import java.util.Scanner;

public class NumberOccurence {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();

        System.out.println("Find occurence of which number:");
        int o = s.nextInt();
        int count = 0;

        while(n > 0){
            int rem = n % 10;
            if(rem == o){
                count++;
            }
            n = n / 10;
        }

        System.out.println("Count of number " + o + " is : " + count);
    }
}
