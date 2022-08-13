package day5;

public class StaticMethods {

    static double multiplication(double a, double b, double c) {
        return a * b * c;
    }

    static void divisionTwoNum(int num1, int num2) {
        System.out.println("whole number = " + num1 / num2 + "; remainder = " + num1 % num2);
    }
}

class StaticMethodsTest {
    public static void main(String[] args) {
        System.out.println(StaticMethods.multiplication(2, 5, 4));
        System.out.println(StaticMethods.multiplication(3.5, 2.5, 4));
        StaticMethods.divisionTwoNum(15, 4);
        StaticMethods.divisionTwoNum(29, 6);
    }
}
