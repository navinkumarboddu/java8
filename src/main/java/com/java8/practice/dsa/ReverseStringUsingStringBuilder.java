package com.java8.practice.dsa;

public class ReverseStringUsingStringBuilder {

     /*
    Given a string, reverse the string word by word.
    Example:
    String: "This is a string"
    Output: "string a is This"
     */

    public static void main(String[] args) {
        String[] s = "This is a string".split(" ");
        System.out.println("Reversed Words : " + reverseWords(s));
    }

    private static String reverseWords(String[] s) {
        StringBuilder s1 = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            s1.append(s[i]);
            if(i-1 >= 0){
                s1.append(" ");
            }
        }
        return s1.toString();
    }


}
