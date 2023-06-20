package com.example.fulljavacourse;

public class stringArrayDuplicate {
    public static void main(String[] args) {
        String[] str = {"Gautam","Rana","Rahul","aadi","kushwah","Gautam","gambir","sachin","aadi","kushwah","sohail"};

        for (int i = 0; i <str.length-1 ; i++) {
            for (int j = i+1; j <str.length ; j++) {
                if (str[i].equals(str[j])){
                    System.out.println(str[i]+" is duplicate at index "+ j);
                }
            }
        }
    }
}
