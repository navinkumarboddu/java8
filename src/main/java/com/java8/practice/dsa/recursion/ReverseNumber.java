package com.java8.practice.dsa.recursion;

public class ReverseNumber {

    public static void main(String[] args) {
        int n = 4813;
        System.out.println(rev2(n));
        //System.out.println(sum);
    }

    static int sum = 0;
    private static void rev1(int n) {
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rev1(n/10);
    }

    private static int rev2(int n) {
        int digits = (int)(Math.log10(n))  + 1;
        return helperFunc(n,digits);
    }

    private static int helperFunc(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, digits-1)) + helperFunc(n/10,digits-1);
    }
}
