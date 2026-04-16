package com.java8.practice.bitwise;

public class OddEven {

    public static void main(String[] args) {
        int i = 38;

        if ((i & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
