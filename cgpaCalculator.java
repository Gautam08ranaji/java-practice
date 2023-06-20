package com.example.fulljavacourse;
import java.util.Scanner;
public class cgpaCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks of english");
        float ENGLISH = sc.nextFloat();
        System.out.println("enter marks of maths");
        float Maths = sc.nextFloat();
        System.out.println("enter marks of science");
        float Science = sc.nextFloat();

        float cgpa = (ENGLISH + Maths +Science)/3;
        System.out.println(cgpa);
    }
}
