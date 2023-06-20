package com.example.fulljavacourse;

public class stringPractice {
    public static void main(String[] args) {
        String s1 = "gautam rana is the most powerful man";
        String s2 = "gautam rana";

        String [] str = s1.split("\s");

        for (String s: str){
            System.out.println(s);
        }



    }
}
