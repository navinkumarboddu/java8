package com.java8.practice.dsa.patterns;

public class Triangle {

    public static void main(String[] args) {
        triangle(4,0);
    }

    static void triangle(int rows,int cols){
        if(rows==0){
            return;
        }
        if(cols<rows){
            System.out.print("*");
            triangle(rows,cols+1);
        } else {
            System.out.println();
            triangle(rows-1,0);
        }
    }
}
