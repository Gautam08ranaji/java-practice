package com.example.fulljavacourse;

public class compareStrings {
    public static void main(String[] args) {


        String s1 = "i am gautam 1";
        String s2 = "i am gautam 1";
        int result = s1.compareTo(s2);

        if (result<0){
            System.out.println("\""+ s1+" is less then "+s2+"\"");
        } else if (result==0) {
            System.out.println("both are equal");
        } else   {
            System.out.println(s1+" is greater then "+s2);
        }
        {
//            System.out.println("not");
        }
    }
}
