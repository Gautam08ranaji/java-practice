package com.example.fulljavacourse;

import java.util.Arrays;

public class insertEleInSpecificPosArray {
    static void insertEle(int[] arr, int el,int ind){
        for (int i = 0; i <arr.length ; i++) {
            if (i==ind){
                arr[i]=el;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,77, 3, 67, 66};
        insertEle(arr,555,3);
//        arr[1]=44;
        System.out.println(arr[1]);



    }
}
