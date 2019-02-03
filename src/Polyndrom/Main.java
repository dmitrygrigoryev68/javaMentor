package Polyndrom;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Madam, I'm Adam"));

    }

    public static boolean isPalindrome(String text) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetterOrDigit(text.charAt(i)))
                sb.append(text.charAt(i));
        }

        return sb.toString().toUpperCase().equals(sb.reverse().toString().toUpperCase());
    }


}