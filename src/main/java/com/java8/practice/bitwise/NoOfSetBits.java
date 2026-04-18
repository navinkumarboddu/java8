package com.java8.practice.bitwise;

public class NoOfSetBits {

    public void main(String[] args) {
        int n = 45;
        int count = getCount(n);

        System.out.println("No of set bits:" + count);

        System.out.println(Integer.toBinaryString(n));

        System.out.println("No of set bits:" + setBits(n));
    }

    private int setBits(int n) {
        int count = 0;

        while(n > 0){
            count++;
            n = (n & (n-1));
        }
        return count;
    }

    private static int getCount(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
