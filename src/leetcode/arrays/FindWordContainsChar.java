package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindWordContainsChar {
    public static void main(String[] args) {

    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}
