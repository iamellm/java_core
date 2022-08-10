package exercises.java_masterclass.oop.carpet_cost_calculator;

public class Floor {

    private double width;
    private double length;

   public Floor(double width, double height) {
        this.width = width;
        this.length = height;
        if(width < 0) {
            this.width = 0;
        }
        if(height < 0) {
            this.length = 0;
        }
    }

    public double getArea() {
        return width * length;
    }
}
