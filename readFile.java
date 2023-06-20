package com.example.fulljavacourse;

import java.io.File;
import java.io.FileReader;

public class readFile {
    public static void main(String[] args) {
        File file = new File("newFile.txt");

        char[] arr = new char[50];
        try {
            FileReader input = new FileReader("newFile.txt");
            input.read(arr);
            System.out.println("Data in the file ");
            System.out.println(arr);

            input.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
