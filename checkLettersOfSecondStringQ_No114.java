package com.stringPractice;

import java.util.Scanner;

public class checkLettersOfSecondStringQ_No114 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String s1 = sc.nextLine();
        System.out.println("enter second string");
        String s2 = sc.nextLine();
//        System.out.println("\n");

        System.out.println("checking first string contains letter from second String: " + test(s1,s2));
    }
    public static boolean test(String s1, String s2){
        boolean result = false;
        if (s1.length()<s2.length()){
            result = false;
        }if (s2.isEmpty()){
            System.out.println("string 2 is empty");
            result = false;
        }

        for (int i = 0; i <s2.length() ; i++) {
            if (s1.contains(String.valueOf(s2.charAt(i)))){
                result = true;
                return result;
            }else {
                result = false;
                return result;
            }

        }
        return result;
    }
}

