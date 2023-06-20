package com.example.fulljavacourse;

import java.io.File;

public class fileList {
    public static void main(String[] args) {
        File file = new File("F:\\full java course\\xyz.txt");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }
    }
}
