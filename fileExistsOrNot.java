package com.example.fulljavacourse;

import java.io.File;

public class fileExistsOrNot {
    public static void main(String[] args) {
        File file = new File("newFile.txt");
        if (file.exists()){
            System.out.println("exist");
        }else  System.out.println("not exist");
    }
}
