package com.example.fulljavacourse;
import java.util.Scanner;
public class ifEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter english marks");
        float english = sc.nextFloat();
        System.out.println("enter maths marks");
        float maths = sc.nextFloat();
        System.out.println("enter science marks");
        float science = sc.nextFloat();
        System.out.println("enter total marks");
        float total = (float) (english + maths + science)/3;


        if (total>=40 && english>=33 && maths>=33 && science>=33){
            System.out.println("pass");
            System.out.println(total);
        }else {
            System.out.println("fail");
            System.out.println(total);
        }
    }
}
