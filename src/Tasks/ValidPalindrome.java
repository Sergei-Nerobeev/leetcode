package Tasks;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(isPalindrome("казарак"));
    }

    public static boolean isPalindrome(String string) {
        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(string.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(string.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(string.charAt(left)) != Character.toLowerCase(string.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}