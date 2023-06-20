package com.example.fulljavacourse;
import  java.util.Scanner;
public class hasIntOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        boolean a = sc.hasNextInt();
        System.out.println(a);
    }
}
