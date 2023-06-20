package com.example.fulljavacourse;
import java.util.Scanner;
public class kmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the kilometers");
        float km = sc.nextFloat();
        km *= 0.621371;
        System.out.println(km + " miles");
    }
}
