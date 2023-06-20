package com.example.fulljavacourse;

public class midCharOfStringMethod {
    public static void main(String[] args) {
        String a ="3503";

       String mid = midNum(a);
        System.out.println(mid);
    }

    public static String midNum( String str) {
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}
