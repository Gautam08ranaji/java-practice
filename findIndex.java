package com.example.fulljavacourse;

public class findIndex {

    public static int findInd(int[] arr,int el){
        for (int i = 0; i <arr.length ; i++) {
            if (el==arr[i]){
                System.out.println("element found at index "+ i);
            }
        }

       return 0;
    }
    public static void main(String[] args) {

        int array []={1,2,3,4,5,6};
        System.out.println(findInd(array, 4));

//
    }
}
