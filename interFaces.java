package com.example.fulljavacourse;

interface phone{
      void run();

}
class Iphone implements phone{


    @Override
    public void run() {
        System.out.println("iphone is running");
    }
}
public class interFaces {
    public static void main(String[] args) {
        Iphone i13 = new Iphone();
        i13.run();
    }
}
