package com.example.fulljavacourse;

import java.util.Arrays;
import java.util.stream.Stream;

public class streamArray {
    public static void main(String[] args) {
        String[] arr = { "Geeks", "for", "Geeks" };

        Stream<String> stream = Arrays.stream(arr);

       stream.forEach(str-> System.out.print(str+" "));




    }
}
