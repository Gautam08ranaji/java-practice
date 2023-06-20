package com.example.fulljavacourse;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 5, 6, 66, 67, 77, 88};


        System.out.println("original array "+Arrays.toString(arr));

        for (int i = 0; i <arr.length/2 ; i++) {
            int temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println("reversed Array "+Arrays.toString(arr));
    }
}
