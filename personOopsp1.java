package com.example.fulljavacourse;

class person{
    String name;
    int age;
    person(String name,int age){
        this.name = name;
        this.age=age;
    }
}

public class personOopsp1 {
    public static void main(String[] args) {
        person p1 = new person("First person : "+"harry",24);
        System.out.println(p1.name +"\nage : "+p1.age);

        person p2 = new person("Second person : "+"Gautam",23);
        System.out.println(p2.name +"\nage : "+p2.age);

    }
}
