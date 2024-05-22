package leetcode.algoritms;

public class ValidPalindrome {
    public static void main(String[] args) {

//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("KUKUK"));

    }

    public static boolean isPalindrome(String word) {
        char[] wordCharArray = word.toUpperCase().toCharArray();
        if (word.isEmpty()) {
            return false;
        }
        int leftIndex = 0;
        int rightIndex = wordCharArray.length - 1;
        while (leftIndex < rightIndex) {
            if (!Character.isLetterOrDigit(wordCharArray[leftIndex])) {
                leftIndex++;
                continue;
            }
            if (!Character.isLetterOrDigit(wordCharArray[rightIndex])) {
                rightIndex--;
                continue;
            }
            if (wordCharArray[leftIndex] != wordCharArray[rightIndex]) {
                return false;
            }
            leftIndex++;
            rightIndex--;

        }
        return true;

    }


    public static void switchChars() {
        char tmp;
        char a = 'a';
        char b = 'b';
        tmp = a;
        a = b;
        b = tmp;

    }

    public static void switchInts() {
        int a = 1;
        int b = 3;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + "" + b);
        //поменять а и б местами, не используя временной переменной, use math operaton
    }
}
