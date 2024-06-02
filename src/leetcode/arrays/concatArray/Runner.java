package leetcode.arrays.concatArray;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int[] numbers = {4, 56, 2, 100, 45, 3, 88};

//        System.out.println(Arrays.toString(repeatArray(numbers)));
        System.out.println(Arrays.toString(halfOfArray(numbers)));
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

    //на вход метода приходит массив, на выход ожидается новый массив состоящий из половины входного
//
//    Пример:
//    in = [ "dd", "d", "aa", "ww", "qq"]
//    out = ["dd", "d"]

    public static int [] halfOfArray(int[] num) {
        int len = num.length;
        int halfLen = len / 2;
        int result[] = new int[halfLen];
        for (int i = 0; i < halfLen; i++) {
            result[i] = num[i];
        }
        return result;
    }


//    инпут - aabbba
//    output - 2a3b1a
    public static void archiveInfo(String letter) {

    }
}
