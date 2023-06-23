package com.stringPractice;

public class noOfcharOccursMoreThanTwice110 {
    public static void main(String[] args) {
        String s1 ="iamgautamranagg";
        StringBuilder reverser= new StringBuilder(s1);
        s1 = reverser.reverse().toString();
        System.out.println(s1);
        int num=0;
        int count =0;
        for (int i = 0; i <s1.length()-1 ; i++) {
            for (int j = i+1; j <s1.length() ; j++) {
                if (s1.charAt(i)==s1.charAt(j)){
                    count++;
                    if (count>2){
                        num++;
                        count=0;
                    }
                }
            }
        }
        System.out.println(num);

    }
}
