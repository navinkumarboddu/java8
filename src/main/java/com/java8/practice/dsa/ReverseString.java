package com.java8.practice.dsa;

public class ReverseString {

    /*
    Given a string, reverse the string word by word.
    Example:
    String: "This is a string"
    Output: "string a is This"
     */

    public static void main(String[] args) {
        char[] s = "This is a string".toCharArray();
        getReverse(s);
        System.out.println(s);
    }

    //char [] s = T h i s   i s   a   s  t  r  i  n  g
    //            0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

    public static void getReverse(char[] s) {
        int len = s.length;
        int start = 0;
        for(int i=0;i<len; i++){
            System.out.println("index " + i + " : " + s[i]);
            if(s[i] == ' ' && i > 0){
                // to find the end of word and swap the characters of word
                System.out.println("found space at index " + i);
                reverseStr(s, start, i-1);
                start = i + 1;
            } else if(i == len -1) {
                // to find the word at the end of string
                reverseStr(s, start, i);
            }
        }
        System.out.println(s);
        // to reverse all characters in array where individual word characters are reversed,
        // to get final reversed words in the string
        reverseStr(s,0,len-1);
    }

    public static void reverseStr(char[] str, int start, int end) {
        while(start < end){
            swapChars(str, start,end);
            start++;
            end--;
        }
    }

    public static void swapChars(char[] str, int start, int end) {
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
    }
}
