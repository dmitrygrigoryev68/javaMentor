package isDegreeOfTwo;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(2));

    }


    public static boolean isPowerOfTwo(int value) {

            int res = Math.abs(value);
            return Integer.bitCount(res) == 1;

    }

}
