package ascii;

public class Main {
    public static void main(String[] args) {

        byte [] arr = {0,1,2,3};

        AsciiCharSequence asc = new AsciiCharSequence(arr);

        System.out.println(asc);
    }
}
