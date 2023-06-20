package com.example.fulljavacourse;

import java.util.Arrays;

public class removeArrElement {
    static void removeIndexOfArray(int[] ar, int el){

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,6,7,8,9,0};

        int rem = 3;

        for (int i = rem; i <arr.length-1 ; i++) {
            arr[i]= arr[i+1];

        }
        System.out.println(Arrays.toString(arr));



    }
}
