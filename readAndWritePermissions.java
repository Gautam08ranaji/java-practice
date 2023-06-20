package com.example.fulljavacourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readAndWritePermissions {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file =  new File("readAndWrite.txt");
        file.createNewFile();


        if (file.exists()){
            System.out.println("exists");
        }else {
            System.out.println("not exiats");
        }
//        FileReader fis = new FileReader("readAndWrite.txt");

        if (file.canRead()){
            System.out.println(file.getAbsolutePath()+ " can read");
        }
        else System.out.println(file.getAbsolutePath()+ " can not read");

        if (file.canWrite()){
            System.out.println(file.getAbsolutePath()+ " can write");
        }
        else System.out.println(file.getAbsolutePath()+ " can not write");


        if (file.isFile()){
            System.out.println(file.getAbsolutePath() + " is a file");
        }else {
            System.out.println(file.getAbsolutePath()+ " is not a file");
        }

        if (file.isDirectory()){
            System.out.println(file.getAbsolutePath() + " is a directory");
        }else {
            System.out.println(file.getAbsolutePath() + " is not a directoryT");
        }
    }
}
