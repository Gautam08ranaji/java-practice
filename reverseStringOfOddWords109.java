package com.stringPractice;

public class reverseStringOfOddWords109 {
    public static void main(String[] args) {
        String s1 = "reverse the string of odd words in nu string";
        String[] str = s1.split("\s");

        for (int i = 0; i < str.length; i++) {
            if (str[i].length()%2!=0){
                StringBuilder reverser = new StringBuilder(str[i]);
                str[i] = reverser.reverse().toString();

            }

        }
        String s3 = String.join(" ",str);
        System.out.println(s3);
    }
}
