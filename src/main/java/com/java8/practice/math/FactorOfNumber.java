package com.java8.practice.math;

import java.util.ArrayList;

public class FactorOfNumber {

    public static void main(String[] args) {
        int n = 20;
        printFactors3(n);
    }

    static void printFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    static void printFactors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if(n/i==i){
                    System.out.print(i);
                } else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    static void printFactors3(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if(n/i==i){
                    factors.add(i);
                } else {
                    factors.add(i);
                    factors.add(n/i);
                }
            }
        }
        factors.stream()
                .sorted()
                .forEach(i -> System.out.print(i + " "));
    }
}
