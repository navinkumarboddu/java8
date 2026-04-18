package com.java8.practice.bitwise;

import java.util.Scanner;

public class NoOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        int b = 10;

        int ans = (int)(Math.log(n)/Math.log(b))  + 1;

        System.out.println(ans);
    }
}
