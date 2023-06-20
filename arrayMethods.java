package com.example.fulljavacourse;

import java.util.Arrays;

public class arrayMethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,77, 3, 67, 66};
        System.out.println(arr.length);
        int[] a1 = arr.clone();
        System.out.println(Arrays.toString(a1));
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.binarySearch(arr,3));

        int[]  array = new int[5];
        Arrays.fill(array,5);
        System.out.println(Arrays.toString(array));

        int [] og = {1,2,3};
        int[] copiedArray = Arrays.copyOf(og,5);
        System.out.println(Arrays.toString(copiedArray));
        System.out.println(copiedArray.length);

        String s1 = Arrays.toString(arr);
        String[] s2 = s1.split("\s");
        System.out.println(Arrays.toString(s2));
        for (String i : s2){
            System.out.println(i);
        }


      Arrays.sort(arr);
        int a2 = arr.length;
        System.out.println(arr[a2-1]);


    }

}