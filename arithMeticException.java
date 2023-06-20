package com.example.fulljavacourse;

public class arithMeticException {
    public static void main(String[] args) {

        try {
            int a = 6/0;
            System.out.println(a);
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }

    }

}
