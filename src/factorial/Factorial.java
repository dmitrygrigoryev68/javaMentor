package factorial;

import java.math.BigInteger;


public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));

    }

    public static BigInteger factorial(int value) {

        BigInteger fact = BigInteger.valueOf(value);
        if (fact.intValue() <= 1) {
            return BigInteger.valueOf(1);
        }
        return fact.multiply(factorial(fact.intValue() - 1));
    }
}