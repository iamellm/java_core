package day3;

public class Car2 {
    String color;
    String engine;

    Car2(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
}

class Car2Test{
    public static void main(String[] args) {
        Car2 car = new Car2("white", "V8");
        System.out.println("Car color is " + car.color);
        System.out.println("Car engine is " + car.engine);
    }
}
