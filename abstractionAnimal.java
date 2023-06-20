package com.example.fulljavacourse;

 abstract class Anim{
    public abstract void Sound();
}
class Lion extends Anim{
     @Override
    public void Sound(){
         System.out.println("Lion is roaring");
     }
}
class Tiger extends Anim{
    @Override
    public void Sound(){
        System.out.println("Tiger is growling");
    }
}
public class abstractionAnimal{
    public static void main(String[] args) {
        Anim Lion1  = new Lion();
        Lion1.Sound();
        Anim Tiger1 = new Tiger();
        Tiger1.Sound();

    }
}