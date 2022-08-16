package exercises;

public class Converion {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid inches parameters");
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

class ConversionTest {
    public static void main(String[] args) {
        Converion.calcFeetAndInchesToCentimeters(-10, 5);
        Converion.calcFeetAndInchesToCentimeters(5, -2);
        Converion.calcFeetAndInchesToCentimeters(10, 14);
        Converion.calcFeetAndInchesToCentimeters(5, 12);
        Converion.calcFeetAndInchesToCentimeters(6,0);
        Converion.calcFeetAndInchesToCentimeters(0, 1);
        Converion.calcFeetAndInchesToCentimeters(-10);
        Converion.calcFeetAndInchesToCentimeters(157);

    }
}
