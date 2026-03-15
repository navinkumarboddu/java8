package com.java8.practice;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        //System.out.println(n);

        //System.out.println(checkArmStrong(n));

        for (int i = 100; i < 100000; i++) {
            if(checkArmStrong(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean checkArmStrong(int n) {
        int original = n;
        int sum = 0;
        while(n > 0){
            int d = n%10;
            int cube = d * d * d;
            sum = sum + cube;
            n = n / 10;
        }
        return original == sum;
    }
}
