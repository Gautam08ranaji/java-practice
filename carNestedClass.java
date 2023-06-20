package com.example.fulljavacourse;
class Car{
    String carName;
    String carType;

    public Car(String name,String type){
        this.carName = name;
        this.carType = type;
    }
    private String getCarName(){
        return this.carName;

    }


    class Engine{
        String engineType;
        void setEngineType(){
            if (Car.this.carType.equals("sedan")||Car.this.carType.equals("Sedan")){
                this.engineType="4WD";
            }else{
                this.engineType="8WD";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
        public void carDetails(){
            System.out.println("Car Name : "+carName+ "\nCar Type : "+ carType +"\nCar Engine "+ engineType  );
        }
    }
}

public class carNestedClass {
    public static void main(String[] args) {
        Car car1 = new Car("Scorpio s11","Suv");
        Car.Engine c1engine = car1.new Engine();
        c1engine.setEngineType();
        c1engine.carDetails();



    }
}
