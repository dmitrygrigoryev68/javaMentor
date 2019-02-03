package integrate;

import java.util.function.DoubleUnaryOperator;

public class Main {
    public static void main(String[] args) {
        DoubleUnaryOperator f = (operand -> operand*operand);
        DoubleUnaryOperator f1 = Main::fun;
        DoubleUnaryOperator f2 = new DoubleUnaryOperator() {
            @Override
            public double applyAsDouble(double operand) {
                return operand*operand;
            }
        };
        System.out.println(integrate(f, 2, 0));
        System.out.println(integrate(f1, 2, 0));
        System.out.println(integrate(f2, 2, 0));

    }
    static double fun(double x){
        return x*x;
    }
    static double integrate(DoubleUnaryOperator f, double a, double b) {
        return f.applyAsDouble(a);
    }

}