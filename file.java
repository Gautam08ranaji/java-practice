package com.example.fulljavacourse;

import java.io.File;

public class file {
    public static void main(String[] args) {
        File file = new File("newFile.txt");

        try {
            boolean value = file.createNewFile();
            if (value){
                System.out.println("new file is created");
            }else {
                System.out.println("the file already exists");
            }
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println(file.getName());

    }
}
