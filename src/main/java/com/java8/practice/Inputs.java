package com.java8.practice;

import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username: ");
        System.out.println("User name is: " + s.next());

        System.out.print("Enter marks: ");
        System.out.println("Marks: " + s.nextFloat());

    }
}
