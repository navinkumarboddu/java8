package com.java8.practice.bitwise;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        boolean flag = (n & (n-1)) == 0;
        System.out.println(flag ? "true" : "false");
    }
}
