package com.example.fulljavacourse;

public class privateAccessModifier {
     private void display(){
        System.out.println("display is running");
    }

}class b{
    public static void main(String[] args) {
        privateAccessModifier obj = new privateAccessModifier();
//        obj.display();  uncomment for understand pruvate Access Modifier;
    }
}
