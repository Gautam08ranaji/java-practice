package com.stringPractice;

class classObject{
String str;
    classObject(String str){
        this.str=str;
//        this.s1=s1;
//        System.out.println("constructor defined");
    }
//    String s1 = "super class method";
    String s2 = "example";

    public void display(){
//        System.out.println(s1+" "+s2);
    }
    public void display(String s1){

        System.out.println("this is overloading"+s1);
    }


}class overRiding extends  classObject{
    overRiding(String str) {
        super(str);
    }

    @Override
    public void display(){
        super.display();
        System.out.println("child class");

    }
}


public class oo1 {
    public static void main(String[] args) {
    classObject c1 = new classObject("constructor parameter");
        System.out.println(c1.str);
//


    }
}
