package exercises;

import java.math.BigInteger;

public class FactorialNumber {
    public BigInteger factorial(int value) {

        if (value == 0) {
            return BigInteger.ONE;
        } else {
            return value == 1 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorial(value - 1));
        }
    }

    public static void main(String[] args) {
        FactorialNumber fNum = new FactorialNumber();
        System.out.println(fNum.factorial(3));

    }
}
