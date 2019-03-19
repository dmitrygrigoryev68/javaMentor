package polyndrom;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Madam, I'm Adam"));

    }

    public static boolean isPalindrome(String text) {
        StringBuilder sb = new StringBuilder();
        sb.append(text.replaceAll("[^A-Za-z1-9]+", ""));
        return sb.toString().compareToIgnoreCase(sb.reverse().toString()) == 0;
    }


}