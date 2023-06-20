package com.example.fulljavacourse;

public class methodsINjava {
    public static void main(String[] args) {
        main();
        methodsINjava obj = new methodsINjava();
        obj.unstatic();
    }

    static void main(){
        System.out.println("main method outside the class");
    }

    public void unstatic(){
        System.out.println("non-static method is called");
    }

}
