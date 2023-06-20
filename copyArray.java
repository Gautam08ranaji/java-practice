package com.example.fulljavacourse;

import java.util.Arrays;

public class copyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,77, 3, 67, 66};
        int[] newArr = new int[10];

        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.out.println("original array " + Arrays.toString(arr));
        System.out.println("copied array   "+Arrays.toString(newArr));
    }
}
