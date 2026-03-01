package com.java8.practice;

import java.util.Scanner;

public class Fibonancci {

    // 0,1,1,2,3,5,8,13,21,34,55,89,...

    /*
    start a = 0, b = 1  -> 0,1,1
    iter1 a = 1, b = 1  -> 0,1,1,2
    iter2 a = 1, b = 2  -> 0,1,1,2,3
    iter3 a = 2, b = 3  -> 0,1,1,2,3,5
     */

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 2;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the fibonacci series size :");
        int size = s.nextInt();

//       while (count <= size ){
//            int temp =  a; //arr[count - 1];
//            b = b + a;
//            a = temp;
//            count++;
//       }

        int[] arr = new int[size];

        if (size >= 1) arr[0] = a;
        if (size >= 2) arr[1] = b;

        for (int i = 2; i < size; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
