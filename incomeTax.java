package com.example.fulljavacourse;
import java.util.Scanner;
public class incomeTax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter income ");
        float income = sc.nextFloat();
        float tax=0;
        
       if (income<250000){
           tax += 0;
           System.out.println("you have to pay "+tax+" rs  tax");
       } else if (income>=250000f && income<500000f) {
           tax = income*0.05f;
           System.out.println("you have to pay "+tax+" rs  tax");

       } else if (income>=500000f && income<1000000f) {
           tax = tax + 0.2f*(income-250000f);
           System.out.println("you have to pay "+tax+" rs  tax");
       } else if (income>=1000000) {
           tax = tax + 0.3f*(income-250000f);
           System.out.println("you have to pay "+tax+" rs  tax");
       }else {
           System.out.println("error in program");
       }

    }
}
