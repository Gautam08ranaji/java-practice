package com.example.fulljavacourse;

public class stringCharUnicode {
    public static void main(String[] args) {
        String str ="h3ey i am Gautam Rana";
        System.out.println(str.codePointAt(2));

//        GET THE UNICODE BEFORE SPECIFIED INDEX
        System.out.println(str.codePointBefore(3));
        System.out.println(str.codePointCount(0,9));
        int ctr = str.codePointCount(1,10);
        System.out.println(ctr);
    }
}
