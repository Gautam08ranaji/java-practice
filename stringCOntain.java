package com.example.fulljavacourse;

public class stringCOntain {

        public static void main(String[] args) {
            String str1 = "Learn Java";
            String str2 = "Java";
            String str3 = "python";
            Boolean result;

            // true because "Learn Java" contains "Java"
           if (str1.contains(str2)){
               System.out.println("str1 contains str2 : " + str2);
           }else {
               System.out.println("str1 does not contains str2 : " + str2);
           }
           if (str1.contains(str3)){
               System.out.println("str1 contains str3: " + str3);
           }
           else {
               System.out.println("str1 does not  contains str3 : " + str3);
           }
        }
}
