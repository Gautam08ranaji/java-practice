package com.example.fulljavacourse;

public class methodsjava {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = add(a,b);
        System.out.println(c);

    }
    static int add(int x, int y){
        int sum ;

        sum = x + y;

        return sum;
    }
}
