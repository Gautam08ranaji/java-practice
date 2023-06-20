package com.example.fulljavacourse;

import java.util.Arrays;

public class subString {
    public static void main(String[] args) {
        String s1 = "hey i am Gautam Rana";
        int [] arr = {2,4,5,7,2,86,23,45};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        System.out.println(s1.substring(0 ,15));
        System.out.println(s1.substring(4));
    }
}
