package com.example.fulljavacourse;

import java.util.ArrayList;

public class joinStringWithArrayList {
    public static void main(String[] args) {
        ArrayList<String>  text =  new ArrayList<>();

        text.add("java");
        text.add("is");
        text.add("fun");

        String rep = "java123is123cool";

        String result = String.join("-",text);
        System.out.println(result);
        System.out.println(result.replace('a','i'));
        System.out.println(rep.replaceAll("\\d+"," "));
        String str1 = "+a-+b";
        System.out.println(str1.replaceAll("\\+","#"));

        String regex = "^G.u..m$";

        System.out.println("Gautam".matches(regex));
        System.out.println(rep.toCharArray());
    }
}
