package com.java8.practice;

public class Primitives {

    public static void main(String[] args) {
        int rollNo = 64;
        char c = 'r';
        float marks = 98.67f;
        double largeDecimalNumbers = 456789.5678;
        long largeIntegereNumbers = 456789091212121212L;
        boolean check = false;

        Integer a = 127;
        Integer b = 127;

        System.out.println(a == b); // Integer Cache


        Integer a1 = 200;
        Integer b1 = 200;

        System.out.println(a1 == b1);
    }
}
