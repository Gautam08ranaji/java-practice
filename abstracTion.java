package com.example.fulljavacourse;

    abstract class animal {

        public void eat(){
            System.out.println("animal is eating");
        }

        abstract public void walk();
}
class Horse extends animal{

    public void walk(){
        System.out.println("Horse is walking");
    }
    public void eat(){
        super.eat();
        System.out.println("Horse is eating");
    }

}
    class cats extends animal{


        public void walk(){
            System.out.println("cat is walking");
        }
        public void eat(){
            super.eat();
            System.out.println("cat is eating");
        }
    }

public class abstracTion {
    public static void main(String[] args) {

//        animal a1 = new animal(); ---animal is abstract can not be instanciated
//        a1.walk();


        Horse h1 = new Horse();
        cats c1 = new cats();

        h1.walk();
        h1.eat();
        c1.walk();
        c1.eat();

    }
}
