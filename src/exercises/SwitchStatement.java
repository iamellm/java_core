package exercises;

public class SwitchStatement {

    public static void daysQuantity(int days) {
        switch (days) {
            // case 2 -> System.out.println("28 days in this month.");
            // case 4, 6, 9, 11 -> System.out.println("30 days in this month.");
            // case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days in this month.");
            // default -> System.out.println("Wrong input. Try again. Month starts from 1 to 12 included.");
            case 2:
                System.out.println("28 days in this month.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days in this month.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in this month.");
                break;
            default:
                System.out.println("Wrong input. Try again. Month starts from 1 to 12 included.");
        }
    }
    public static void main(String[] args) {
        daysQuantity(2);
        SwitchStatement.daysQuantity(0);
        daysQuantity(1);
        SwitchStatement.daysQuantity(9);
        daysQuantity(-3);
    }
}
