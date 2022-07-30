package exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class BigDecimalMultiplyAndDivide {
    public static void main(String[] args) {
        BigDecimal d = new BigDecimal("10000.5");
        BigDecimal taxRate = new BigDecimal("0.35");
        BigDecimal d2 = d.multiply(taxRate);
        //  d2 = d2.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Unformatted final amount: " + d2.toString());
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        double money = d2.doubleValue();
        String s = n.format(money);
        System.out.println("Formatted final amount: " + s);


        BigDecimal d3 = new BigDecimal("1500.95");
        BigDecimal days = new BigDecimal("30");
        BigDecimal d4 = d3.divide(days, 2, RoundingMode.HALF_UP);
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.US);
        double money2 = d4.doubleValue();
        String s2 = n2.format(money2);
        System.out.println("Daily payment of this month: " + s2);

        // Calculating the interest

        BigDecimal principal = new BigDecimal("9500.00");
        BigDecimal rate = new BigDecimal("0.067");
        BigDecimal time = new BigDecimal("0.25");
        BigDecimal temp = principal.multiply(rate);
        BigDecimal interest = temp.multiply(time);
        NumberFormat num = NumberFormat.getCurrencyInstance(Locale.US);
        double amount = interest.doubleValue();
        String str2 = num.format(amount);
        System.out.println("First quarter interest: " + str2);
    }
}
