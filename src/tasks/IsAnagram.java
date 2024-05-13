package tasks;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
    boolean result = isAnagram("cat","car");
        System.out.println(result);
    }
    public static boolean isAnagram(String s, String t) {
    char[] charArrays = s.toCharArray();
    char[] charArrayt = t.toCharArray();
    Arrays.sort(charArrays);
    Arrays.sort(charArrayt);
    return Arrays.equals(charArrays, charArrayt);
    }
}
