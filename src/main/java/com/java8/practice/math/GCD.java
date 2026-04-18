package com.java8.practice.math;

public class GCD {

    public static void main(String[] args) {
        int a = 13;
        int b = 17;
        System.out.println("GCD :::"+findGCD(a,b));
        System.out.println("LCM ::: " + findLCM(a,b));

        printGCDnLCM(a,b);
    }

    private static void printGCDnLCM(int a, int b) {
        int lcm = 0;
        for (int i = 1; i <= a*b; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("LCM ::: " + i);
                lcm = i;
                break;
            }
        }
        System.out.println("GCD ::: " + (a*b)/lcm);
    }

    private static int findGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return findGCD(b%a, a);
    }

    private static int findLCM(int a, int b) {
        for (int i = 1; i <= a*b; i++) {
            if(i % a == 0 && i % b == 0){
                return i;
            }
        }
        return -1;
    }
}
