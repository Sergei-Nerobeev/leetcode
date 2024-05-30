package leetcode.arrays.concatArray;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int[] numbers = {4, 2, 6, 8};

        System.out.println(Arrays.toString(repeatArray(numbers)));
    }

    public static int[] repeatArray(int[] num) {
        int len = num.length;
        int[] res = new int[len * 2];
        for (int i = 0; i < len; i++) {
            res[i] = num[i];
        }
        for (int i = 0; i < len; i++) {
            res[i + len] = num[i];
        }
        return res;
    }

}
