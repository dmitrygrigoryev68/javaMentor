package factorial;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int value) {

        BigInteger fact = BigInteger.valueOf(value);

        for (int i = 1; i < value; i++) {

            fact = fact.multiply(BigInteger.valueOf(i));

        }

        return fact; // your implementation here
    }
}