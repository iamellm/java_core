package exercises.java_masterclass.oop.carpet_cost_calculator;

public class Main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(10);
        Floor floor = new Floor(2.5, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total cost = " + calculator.getTotalCost());
        carpet = new Carpet(5);
        floor = new Floor(5.8, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total cost = " + calculator.getTotalCost());
    }
}
