package ascii;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    private byte[] arr;

    AsciiCharSequence (byte [] arr){
        this.arr = arr;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public String toString() {
        return "AsciiCharSequence{" + "arr=" + Arrays.toString(arr) + '}';
    }
}