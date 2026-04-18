package com.java8.practice.dsa.recursion;

public class N21 {

    public static void main(String[] args) {
        printNumbers(10);
        System.out.println();
        printNumbersRev(10);
        System.out.println();
        printNumbersSerial(10);
        System.out.println();
        printNos(10);
        System.out.println();
        printNoSerial(10);
    }

    static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        printNumbers(n-1);
    }

    static void printNumbersRev(int n){
        if(n==0){
            return;
        }
        printNumbersRev(n-1);
        System.out.print(n + " ");
    }

    static void printNumbersSerial(int n){
        int count = 1;
        while(count<=n){
            System.out.print(count + " ");
            count++;
        }
    }

    static void printNos(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " " );
        printNos(--n);
    }

    static void printNoSerial(int n){
        if(n==0){
            return;
        }

        printNoSerial(--n);
        System.out.print(n + 1 + " " );
    }
}

