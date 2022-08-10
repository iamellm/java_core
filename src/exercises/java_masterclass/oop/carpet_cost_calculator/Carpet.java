package exercises.java_masterclass.oop.carpet_cost_calculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
        if(cost < 0) {
            this.cost = 0;
        }
    }

    public double getCost() {
        return this.cost;
    }
}
