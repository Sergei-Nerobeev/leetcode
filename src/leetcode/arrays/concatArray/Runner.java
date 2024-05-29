package leetcode.arrays.concatArray;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int[] numbers = {4, 2, 6, 8};

        System.out.println(Arrays.toString(repeatArray(numbers)));

    }

    public static int[] repeatArray(int[] num) {
        int len1 = num.length;
        int len2 = num.length;
        int[] res = new int[len1 + len2];
        for (int i = 0; i < res.length - 1; i++) {
            res[i] = num[i];
        }
//        res[4] = 4;
//        res[5] = 2;
//        res[6] = 6;
//        res[7] = 8;
        for (int i = 0; i < len1; i++) {
            res[i] = num[i];


//            for (int j = i; j < res.length; j++) {
//                res[i] = num[i];
//            }


        }
        return res;
    }
}
