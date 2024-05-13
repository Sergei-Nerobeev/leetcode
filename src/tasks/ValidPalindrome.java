package tasks;
public class ValidPalindrome {
    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//        System.out.println(isPalindrome(s));
        System.out.println(reverse("НУШРОК"));
//        switchInts();
    }
    //казак
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
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static String reverse(String word) {  // time and memory
        char tempLetter;
        char[] wordCharArray = word.toCharArray();
        for (int i = 0; i < wordCharArray.length / 2; i++) {
            // кот, получить из слова кот слово ток
            // i = 0 (к), ожидаю i = 0 (т)
            // i = 1 (о), ожидаю i = 1 (о)8
            // i = 2 (т), ожидаю i = 2 (к)
            tempLetter = wordCharArray[i]; // k
            wordCharArray[i] = wordCharArray[wordCharArray.length - 1 - i]; // t
            wordCharArray[wordCharArray.length - 1 - i] = tempLetter; // k
            // i = 0, ток
            // i = 1, ток
            // i = 2, kot

        }
        return String.valueOf(wordCharArray);
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
