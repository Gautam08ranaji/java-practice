package com.example.fulljavacourse;

public class avgOfNumbers {
    public static void main(String[] args) {
        int a = 94;
        int b = 98;
        int c= 76;
        float avg = avgOfNum(a,b,c);
        System.out.println(avg);
    }

    static float avgOfNum( int a1,int  b1,int c1){
        float avg;
        avg = (a1+b1+c1)/3.0f;

        return avg ;
    }




}
