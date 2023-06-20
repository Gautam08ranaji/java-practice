package com.example.fulljavacourse;

class Dog{
    String name;
    String breed;

    Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }

    public String getName(){
        return name ;
    }
    public void setName(String n , String b){
        this.name = n;
        this.breed = b;
    }

    public  String getBreed(){
        return breed;
    }
    public void setBreed(String b){
        this.breed=b;
    }
    public void printInfo(){
        System.out.println("hey myself "+name+" and i am "+breed);
    }
}
public class dogsOops2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("max","german");
        System.out.println(d1.getName());
        System.out.println(d1.getBreed());


        d1.setName("tuffy","labrador");
        d1.setBreed("pamelion");

        System.out.println(d1.getName());
        System.out.println(d1.getBreed());

        d1.printInfo();

        d1.setName("harry","labrador");
        d1.setBreed("pam");

        d1.printInfo();

    }
}
