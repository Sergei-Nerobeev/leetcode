package leetcode.algoritms;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(Palindrome.reverseNumber(248));
        System.out.println(Palindrome.isPalindrome(248));
        // 2_147_000_000
    }

    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }
}
