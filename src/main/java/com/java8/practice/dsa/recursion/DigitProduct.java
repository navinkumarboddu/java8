package com.java8.practice.dsa.recursion;

import java.util.Scanner;

public class DigitProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digiProduct(n));
    }

    public static int digiProduct(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n%10)*digiProduct(n/10);
    }
}
