package com.example.fulljavacourse;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class deleteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("delete.txt");
        boolean value = file.createNewFile();
        if (value){
            System.out.println("file is created");
        }else{
            System.out.println("file exists already");
        }

        FileWriter output = new FileWriter("delete.txt");
        output.write("output is wriiten");
        System.out.println("data inserted ");
        output.close();
        boolean del = file.delete();
        if (del){
            System.out.println("file is deleted succeafully");
        }
        else System.out.println("the File is nit Deleted");

    }
}
