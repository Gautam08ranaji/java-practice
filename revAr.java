package com.example.fulljavacourse;

import java.lang.reflect.Array;
import java.util.Arrays;

public class revAr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("original Array "+Arrays.toString(arr));

        for (int i = 0; i <arr.length/2 ; i++) {
            int temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println("revered array "+Arrays.toString(arr));
    }
}
