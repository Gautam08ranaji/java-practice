package com.example.fulljavacourse;
class Rectangle{
    float width;
    float height;
    
    
    Rectangle(float width, float height){
        this.height=height;
        this.width=width;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight (float h){
        this.height =h;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(float w){
        this.width = w;
    }

    public float AreaOfRectangle(){
        float Area = height*width;
        return Area;
    }
    public float getPerimeter(){
        float perimeter = 2* (height+width);
        return perimeter;
    }

}

public class areaOfRectangleOops3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,5.5f);
        System.out.println("the area of rectangle is :"+r1.AreaOfRectangle());
        System.out.println("the perimeter of rectangle is : "+r1.getPerimeter());
        r1.setHeight(4.56f);
        r1.setWidth(27.23f);

        System.out.println("the area of rectangle is : "+r1.AreaOfRectangle());
        System.out.println("the perimeter of rectangle is : "+r1.getPerimeter());

    }
}
