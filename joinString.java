package com.example.fulljavacourse;

public class joinString {
    public static void main(String[] args) {
        String s1 = "I";
        String s2 = "LOVE";
        String s3 = "JAVA";

        String joined = String.join(" ",s1,s2,s3);
        System.out.println(joined);
    }
}
