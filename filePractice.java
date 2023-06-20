package com.example.fulljavacourse;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filePractice {
    public static void main(String[] args) throws IOException {
        File file = new File("Rana.txt");
        boolean newFile = file.createNewFile();
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());

        FileWriter fw = new FileWriter("Rana.txt");
        String data = "i am Gautam Rana";
        fw.write(data);
        fw.close();


        char[] array = new char[16];
        FileReader fr = new FileReader("Rana.txt");
        fr.read(array);
        System.out.println(array);
        fr.close();

    }
}
