package tasks;

public class ValidPalindrome {
    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//        System.out.println(isPalindrome(s));
        System.out.println(issPalindrome("KAZAK"));
//        switchInts();
    }
    //казак
//    public static boolean isPalindrome(String s) {
//        int left = 0;
//        int right = s.length() - 1;
//
//        while (left < right) {
//
//            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                left++;
//            }
//
//            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                right--;
//            }
//
//            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                return false;
//            }
//
//            left++;
//            right--;
//        }
//
//        return true;
//    }


    public static String reverse(String word) {  // time and memory
        char tempLetter;
        char[] wordCharArray = word.toCharArray();
        for (int i = 0; i < wordCharArray.length / 2; i++) {
            //N -> K

            tempLetter = wordCharArray[i];
            wordCharArray[i] = wordCharArray[wordCharArray.length - 1 - i];
            wordCharArray[wordCharArray.length - 1 - i] = tempLetter;

        }
        return String.valueOf(wordCharArray);
    }

    public static boolean isPalindrome(String word) {  // time and memory
        char[] wordCharArray = word.toUpperCase().toCharArray();
        int rightIndex = wordCharArray.length - 1;
        for (int i = 0; i < wordCharArray.length / 2; i++) {
            //A -> A
            //space -> M
            if (wordCharArray[i] != wordCharArray[wordCharArray.length - 1 - i]) {
                return false;
            }

        }
        return true;
    }

    public static boolean issPalindrome(String word) {
        char[] wordCharArray = word.toUpperCase().toCharArray();
        int leftIndex = 0;
        int rightIndex = wordCharArray.length - 1;
        while (leftIndex < rightIndex) {
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
