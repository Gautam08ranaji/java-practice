package com.example.fulljavacourse;

public class gratestNumberMethod {
    public static void main(String[] args) {
        int a = 14;
        int b = 38;
        int c= 26;
        int gn = gratestNumber(a,b,c);
        System.out.println(gn);
    }

    static int gratestNumber( int a1,int  b1,int c1){
        int gr;
        if (a1>b1 && a1>c1){
            gr= a1;
//            System.out.println(a1+ " is greater ");
        } else if (b1>a1 &&b1> c1) {
            gr =b1;
//            System.out.println(b1+ " is greater");
        }else{
            gr=c1;}

        return gr;
    }



}
