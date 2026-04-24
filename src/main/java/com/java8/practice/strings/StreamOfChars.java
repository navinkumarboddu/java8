package com.java8.practice.strings;

public class StreamOfChars {

    public static void main(String[] args) {
        skip(" ", "baccdah");

        System.out.println(skip( "baccdah"));
    }

    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch =  up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    public static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch =  up.charAt(0);

        if(ch == 'a'){
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }
}
