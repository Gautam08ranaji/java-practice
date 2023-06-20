package com.example.fulljavacourse;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) throws IOException {
        String Data = "This is the data in the output file";
        String data = "\nthis is appended data  ";
        FileWriter output = new FileWriter("newFile.txt");
        output.write(Data);
        output.append(data);
        System.out.println("data is appended");
        System.out.println("data is wriiten");

        output.close();
    }
}
