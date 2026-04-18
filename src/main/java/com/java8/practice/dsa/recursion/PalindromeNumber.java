package com.java8.practice.dsa.recursion;

public class PalindromeNumber {

    public static void main(String[] args) {
        int n = 435534;
        System.out.println(checkPalindrome(n));
    }

    static boolean checkPalindrome(int n){
        return n == reverse(n);
    }

    private static int reverse(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helperfunc(n,digits);
    }

    private static int helperfunc(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, digits-1)) + helperfunc(n/10,digits-1);
    }
}
