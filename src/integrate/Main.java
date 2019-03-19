package integrate;

import java.util.function.DoubleUnaryOperator;

public class Main {

    public static void main(String[] args) {

        System.out.println(integrate(x -> 10, 0, 10));

    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double h = 1;
        double integral = 0;
        double integralTemp;


        do {

            for (double i = a; i < b; i = i + h) {
                integral += f.applyAsDouble(i);
            }
            integral *= h;
            h = h / 2;
            integralTemp = integral;
            integral = 0.0;
            for (double i = a; i < b; i = i + h) {
                integral += f.applyAsDouble(i);
            }
            integral *= h;

        }
        while (Math.abs(integral - integralTemp) > 0.1);
        return integral;
    }
}
