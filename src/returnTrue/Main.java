package returnTrue;

public class Main {

    public static void main(String[] args) {
        System.out.println(booleanExpression(true,true,false,false));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {


        return ((a ^ b) && (c ^ d)) || ((a ^ c) && (b ^ d)) || ((a ^ d) && (b ^ c)); }
}
