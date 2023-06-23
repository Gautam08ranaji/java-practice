package com.stringPractice;

public class occuranceOfStringInOtherString105 {
    public static void main(String[] args) {
        String s1 = "abcd aa abca bcaa aacb aa aabdsj";
        String s2 = "aa";
        String []s3 = s1.split("\s");
        test(s1,s2,s3);


    }
    public static void test(String s1,String s2,String[] s3){
        int num=0;
        for (int i = 0; i <s3.length ; i++) {
            if (s1.isEmpty()||s2.isEmpty()){
                throw new IllegalArgumentException("String can not be empty");
            }
            if (s3[i].contains(s2)){
                num++;
            }
        }

        System.out.println("String "+ s2 + " is repeted : " + num + " times");


    }
}
