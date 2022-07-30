package day3;

public class Human {
    String name;
    Car3 car;
    BankAccount2 bA;

    void showInfo(){
        System.out.println("name: " + name + ", car color: " + car.color + ", bank account balance: " + bA.balance + "$.");
    }
}

class Car3{
    String color;
    String engine;

    Car3(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
}

class BankAccount2{
    int id;
    double balance;

    BankAccount2(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
}

class HumanTest{
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Evgeny";
        human.car = new Car3("red", "V8");
        human.bA = new BankAccount2(1, 10000.5);
        human.showInfo();
    }
}
