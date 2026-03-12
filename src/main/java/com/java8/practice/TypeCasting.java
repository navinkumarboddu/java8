package com.java8.practice;

import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        float num  = s.nextFloat();
//        System.out.println(num);

//        int num1 = s.nextInt();
//        System.out.println(num1);

        //type casting
        int a = (int) 65.7;
        System.out.println(a);

        //automatic type promotion in expressions
        a = 257;
        byte a1 = (byte) a;
        System.out.println(a1);


    }
}
