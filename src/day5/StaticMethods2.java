package day5;

public class StaticMethods2 {

    public static final double PI = 3.14;

    public double areaOfCircle(double radius1) {
        double area = PI * radius1 * radius1;
        return area;
    }

    public static double circumference(double radius2) {
        double dlinaOkrujnosti = 2 * PI * radius2;
        return dlinaOkrujnosti;
    }

    public void showInfo(double radius3) {
        System.out.println("radius = " + radius3);
        System.out.println("area of circle = " + areaOfCircle(radius3));
        System.out.println("circumference = " + circumference(radius3));
    }
}

class StaticMethodsTest2 {
    public static void main(String[] args) {
        StaticMethods2 sM = new StaticMethods2();
        sM.areaOfCircle(5);
        StaticMethods2.circumference(7.5);
        sM.showInfo(3);

    }
}
