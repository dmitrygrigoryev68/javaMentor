package ascii;


public class AsciiCharSequence implements CharSequence {

    private byte[] arr;

    public AsciiCharSequence(byte[] arr) {

        this.arr = arr;
    }

    @Override
    public int length() {
        return arr.length;
    }

    @Override
    public char charAt(int index) {

        return (char) arr[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] result = new byte[end-start];
        for(int i = start; i < end; i++ ){
            result[i-start] = arr[i];
        }
        return new AsciiCharSequence(result);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(arr.length);
        for(int i = 0; i < arr.length; i++ ){
            result.append((char) arr[i]);
        }
        return result.toString();
    }
}
