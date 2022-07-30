package day3;

public class Car {
    String color;
    String engine;
    int speed;

    int acceleration(int pace) {
        speed += pace;
        return speed;
    }

    int brake(int pace) {
        speed -= pace;
        return speed;
    }

    void showInfo() {
        System.out.println("Car's color: " + color + " car's engine " + engine + " car's speed: " + speed + " km/h.");
    }
}

class CarTest{
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Sky blue";
        car.engine = "V10";
        car.speed = 120;

        car.showInfo();
        car.acceleration(30);
        car.showInfo();
        car.brake(60);
        car.showInfo();
    }
}
