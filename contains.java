package com.example.fulljavacourse;

import java.util.Arrays;
import java.util.List;

public class contains {
    public static void main(String[] args) {
        Integer myArr[]={2,5,64,85,36,867,336,679,3346,85,46,4575};
        String str[] = {"gautam","rana","rahul","kushwah"};
        List<Integer> list = Arrays.asList(myArr);
        List<String> list1 = Arrays.asList(str);
//        Arrays.sort(myArr);
        for (String s : list1){
            System.out.println(s+" ");
        }
        System.out.println("\n");

//        Arrays.sort(myArr);
        for (int s : myArr){
            System.out.println(s+" ");
        }
        System.out.println(Arrays.binarySearch(myArr,85));

        int[][] mat = new int[2][2];
        mat[0][0] = 99;
        mat[0][1] = 151;
        mat[1][0] = 30;
        mat[1][1] = 5;

        System.out.println(Arrays.deepToString(mat));
        int[]a1 = new int[5];
        System.out.println(Arrays.toString(a1));
        Arrays.fill(a1,2,4,100);
        System.out.println(Arrays.toString(a1));


        int[][]Arr2d = new int[3][3];
        for (int[] row : Arr2d){
                Arrays.fill(row,99);
        }
        System.out.println(Arrays.deepToString(Arr2d));
        int intArr[] = { 10, 20, 15, 22, 35 };

        // Get the second Arrays
        int intArr1[] = { 10, 20, 15,22,35 };

        // To compare both arrays
        System.out.println("The element mismatched at index: " + Arrays.mismatch(intArr, intArr1));
    }
}
