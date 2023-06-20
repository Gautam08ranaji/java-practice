package com.example.fulljavacourse;
class TrafficLight{
     private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color =color;
        this.duration=duration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void changeColor(String changeCol){
        this.color=changeCol;
    }


    public void checkLightColor(){
        if (color.equals("red")){
            System.out.println("the Traffic Light is : Red");
        }else {
            System.out.println("the Traffic Light is : Green");
        }
    }



}

public class trafficLightOops8 {
    public static void main(String[] args) {

        TrafficLight t1 = new TrafficLight("red",30);
        System.out.println(t1.getColor());
        System.out.println(t1.getDuration());
        t1.checkLightColor();

        t1.setColor("green");
        t1.setDuration(20);

        t1.checkLightColor();
    }
}
