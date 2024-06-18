package leetcode.arrays;

import java.util.Arrays;

public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = new String[]{"--X", "++X", "X++", "X--"};
        System.out.println(Arrays.stream(operations).toList());
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0; // todo array?
        String increment = "++X";
        String increment2 = "X++";
        String decrement = "--X";
        String decrement2 = "X--";
        for (int i = 0; i < operations.length; i++) {

            if (Arrays.stream(operations).distinct() == increment.lines()) x = x + 1;
        }
        return 0;
    }

}
