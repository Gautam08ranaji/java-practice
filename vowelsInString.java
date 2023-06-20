package com.example.fulljavacourse;

public class vowelsInString {
    public static void main(String[] args) {
        String str = "aeiou ";
        vowelsInString obj = new vowelsInString();

        int count = obj.vow(str);
        System.out.println(count);

    }

    public int vow(String str1){
        int counting =0;
        for (int i = 0; i <str1.length() ; i++) {

            if (str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u'|| str1.charAt(i)=='A' || str1.charAt(i)=='E' || str1.charAt(i)=='I' || str1.charAt(i)=='O' || str1.charAt(i)=='U'){
                counting++;
            }
        }

        return counting;
    }

}
