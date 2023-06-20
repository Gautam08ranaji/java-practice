 package com.example.fulljavacourse;

class Pen{
    String color;
    String type;
    public void write(){

        System.out.println(color+" " +type);
        System.out.println("Writing an para.");
    }
    public void printColor(){
        System.out.println(this.color+" color pen");
    }
}
public class oops {
    public static void main(String[] args) {


        Pen p1 = new Pen();
        p1.color="Blue";
        p1.type="Ball pen";
        p1.printColor();
//        p1.write();

        Pen p2 = new Pen();
        p2.color="Black";
        p2.type="gel";
        p2.printColor();
//        p2.write();


    }
}
