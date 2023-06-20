package com.example.fulljavacourse;

public class mrthodOverloading {
    public static void main(String[] args) {
        System.out.println(add(5, 6));
        System.out.println(add(5, 2.34f));
    }

    static int add(int x,int y){
        int sum = x + y;
        return sum;
    }
    static int add(int x,float y){
        int sum = x +  (int) y;
        return sum;
    }
}
