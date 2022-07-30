package exercises;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal payment = new BigDecimal("1345.32");
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        double doublePayment = payment.doubleValue();
        String s = n.format(doublePayment);
        System.out.println("Payment is: " + s);
        // creating a double value involves a small loss in the value's accuracy.
        // While the inaccuracies are too small to be seen in this article's examples,
        // they are visible in very large amounts.
        // Therefore, you cannot rely upon NumericFormat to produce
        // accurate results with very large numbers (about 13 or more digits).

        BigDecimal balance = new BigDecimal("1345.23");
        BigDecimal transaction = new BigDecimal("115.77");
        BigDecimal newBalance = balance.add(transaction);
        NumberFormat nF = NumberFormat.getCurrencyInstance(Locale.US);
        double dP = newBalance.doubleValue();
        String str = nF.format(dP);
        System.out.println("New balance after after adding is: " + str);

        BigDecimal balance2 = new BigDecimal("2000.23");
        BigDecimal transaction2 = new BigDecimal("250.73");
        BigDecimal newBalance2 = balance2.subtract(transaction2);
        NumberFormat nF2 = NumberFormat.getCurrencyInstance(Locale.US);
        double dP2 = newBalance2.doubleValue();
        String str2 = nF2.format(dP2);
        System.out.println("New balance after subtracting is: " + str2);
    }
}
