package leetcode.arrays;

import java.util.Arrays;

public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = new String[]{"--X", "++X", "X++"};
        System.out.println(Arrays.stream(operations).toList());
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                x++;
            } else if ((operation.equals("--X") || operation.equals("X--"))) {
                x--;
            }

        }
        return x;
    }

}
