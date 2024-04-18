package Tasks;

public class ValidPalindrome {
    public static void main(String[] args) {
<<<<<<< HEAD
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
=======

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
>>>>>>> origin/master
                return false;
            }

            left++;
            right--;
        }
<<<<<<< HEAD

        return true;
    }

}
=======
        return true;
    }
}
>>>>>>> origin/master
