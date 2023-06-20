package com.example.fulljavacourse;

import java.util.Arrays;
import java.util.List;

public class containsArray {
    public static void main(String[] args) {
        String intArr[] = { "gautam","rana","jaat"};
        String intArr1[] = Arrays.copyOf(intArr,intArr.length);

        intArr1[2]="apple";
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(intArr1));

        System.out.println(Arrays.equals(intArr,intArr1));


    }
}
