package com.stringPractice;

public class consecutiveIdenticalWords108 {
    public static void main(String[] args) {
        String s1 = "Follow";

        int num =0;
        for (int i = 0; i <s1.length()-1 ; i++) {
            if (s1.charAt(i)==s1.charAt(i+1)){
                num++;
                System.out.println("consecutive identical words are found : "+s1.charAt(i)+" "+s1.charAt(i+1));
            }
        }
        if (num==0){
            System.out.println("no conecutve words are found");
        }

    }
}
