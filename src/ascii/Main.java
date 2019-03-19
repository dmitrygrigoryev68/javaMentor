package ascii;

public class Main {
    public static void main(String[] args) {

        byte [] arr = {1,12,32,127};

        AsciiCharSequence asc = new AsciiCharSequence(arr);

        System.out.println(asc.charAt(0));
    }
}
