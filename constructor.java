package com.example.fulljavacourse;

public class constructor {

     String name;


    constructor(){
        System.out.println("constuctor called");
        name = "Gautam Rana";
    }


    constructor(String s1){
        System.out.println("parametrized constructor called");
        System.out.println(s1);
    }
    public static void main(String[] args) {
        constructor con = new constructor();
        System.out.println("the name is "+con.name);
        constructor newcon = new constructor("parameterized comstructor") ;


    }
}
