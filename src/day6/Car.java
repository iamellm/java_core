package day6;

public class Car {
    String color;
    String engine;
    int doors;

    Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}

class CarTest{

    void changeNumberOfDoors(Car c, int doors) {
        c.doors = doors;
    }

    void changeColors(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest cTest = new CarTest();
        Car c1 = new Car("red", "V8", 4);
        Car c2 = new Car("black", "V12", 2);
        cTest.changeNumberOfDoors(c1, 2);
        cTest.changeNumberOfDoors(c2, 4);
        cTest.changeColors(c1, c2);
        System.out.println("Info about 1st car: color - " + c1.color + ", engine - " + c1.engine + ", number of doors - " + c1.doors);
        System.out.println("Info about 2nd car: color - " + c2.color + ", engine - " + c2.engine + ", number of doors - " + c2.doors);
    }
}


