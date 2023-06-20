package com.example.fulljavacourse;

public class commonEleINArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 6, 7, 8, 9, 10, 11, 12, 13,};
        int[] arr1 = {1, 10, 11, 12, 13, 22, 33, 44, 55, 66, 77, 88, 99};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr1.length ; j++) {
                if (arr[i]==arr1[j]){
                    System.out.println( arr[i]  +" is copy of  "+ arr1[j] );
                }
            }
        }


    }
}
