package com.java8.practice.dsa.search.linear;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "This is beatiful world";
        char[] s = str.toCharArray();
        char target = 'x';
        if(search(s,target)){
            System.out.println("Found character '" + target + "' in the string :" + str);
        } else {
            System.out.println("Character not found...");
        }
    }

    static boolean search(char[] s, char target){
        boolean found = false;
        if(s.length != 0){
            for (int index = 0; index < s.length - 1; index++) {
                if(s[index] == target){
                    found = true;
                }
            }
        }
        return found;
    }
}

