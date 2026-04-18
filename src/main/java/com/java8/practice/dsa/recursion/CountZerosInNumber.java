package com.java8.practice.dsa.recursion;

public class CountZerosInNumber {

    public static void main(String[] args) {
        int n = 30204;
        int count = 0;
        count = countZeros(n,count);
        System.out.println(count);
    }

    private static int countZeros(int n, int count) {
        if(n==0){
            return count;
        }
        if(n%10==0){
            return countZeros(n/10,count+1);
        }
        return countZeros(n/10,count);
    }
}
