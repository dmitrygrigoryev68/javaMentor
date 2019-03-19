package returnTrue;

import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        System.out.println(booleanExpression(true,true,false,false));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {

        for (byte b1 : "Ы".getBytes(StandardCharsets.UTF_8)){
            System.out.printf("%d ", Byte.toUnsignedInt(b1));


        }
        return ((a ^ b) && (c ^ d)) || ((a ^ c) && (b ^ d)) || ((a ^ d) && (b ^ c)); }
}
