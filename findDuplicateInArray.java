package com.example.fulljavacourse;

public class findDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 5, 6, 6, 77, 77, 88,1};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("index "+i+" = "+ arr[i]  +" is copyof index "+ j );
            }
          }
        }


    }
}
