package Tasks;

public class IsPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("mamak"));
    }
    public static boolean isPalindrome(String string) {
        String reversedString = String.valueOf(reverseString(string));
        return reversedString.equals(string);
    }
    public static StringBuilder reverseString(String string) {
        StringBuilder reversed = new StringBuilder(string).reverse();
        return reversed;
    }
}
