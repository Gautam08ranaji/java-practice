package com.example.fulljavacourse;

public class finallyBlock {
    public static void main(String[] args) {

        try {
            int a = 6 / 0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("the exception is : "+e.getMessage());
        }finally {
            System.out.println("finally block is always executed");
        }
    }
    }
