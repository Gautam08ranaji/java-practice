package com.example.fulljavacourse;

public class inherits {
    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.name="tuffy";
        d1.color="black";
        d1.age=4;
        d1.breed="German shephard";

        d1.display();
        d1.eat();
        d1.running();

    }
}
class Animals{
    String name;
    String color;
    String  breed;
    int age;

    public void display(){
        System.out.println("my name is : "+ name);
        System.out.println("my color is : "+ color);
        System.out.println("my breed is : "+ breed);
        System.out.println("my age is : "+ age);
    }
    public void eat(){
        System.out.println( "Animal is eating");
    }
    public void running(){
        System.out.println( "Animal is running");
    }


}
class Dogs extends Animals{
    @Override
    public void eat(){
        super.eat();
        System.out.println("dog is eating pedigree");
    }
    @Override
    public void running(){
        super.running();
        System.out.println("Dog is running");
    }
}
