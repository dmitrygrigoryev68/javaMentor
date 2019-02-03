package isDegreeOfTwo;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(256));

    }


    public static boolean isPowerOfTwo(int value) {
        if (value == 0) {
            return false;
        }
        else {
            int res = Math.abs(value);
            return (res & (res - 1)) == 0;
        }

    }

}
