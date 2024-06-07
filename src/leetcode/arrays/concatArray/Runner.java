package leetcode.arrays.concatArray;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
//        String[] letters = {"dd", "d", "aa", "ww", "qq"};
//        String[] correct = {"dd", "d"};
//        String[] letters2 = {"aa", "1", null, "ww", "qq"};
//        String[] correct2 = {"aa", "1"};
//        String[] letters3 = {"с", "п", "р", "и", "н", "г"};
//        String[] correct3 = {"с", "п", "р"};
//        String[] letters4 = {"single"};
//        String[] correct4 = {};
//        String[] letters5 = {null, null};
//        String[] correct5 = {null};
//        String[] letters6 = {"123", "4567", "789000"};
//        String[] correct6 = {"123"};
//        String[] letters7 = {};
//        String[] correct7 = {};
//        String[] letters8 = {null};
//        String[] correct8 = {};
//
//        System.out.println((Arrays.toString(halfOfStringArray(letters))));
//        halfOfStringArrayTest(letters, correct);
//        halfOfStringArrayTest(letters2, correct2);
//        halfOfStringArrayTest(letters3, correct3);
//        halfOfStringArrayTest(letters4, correct4);
//        halfOfStringArrayTest(letters5, correct5);
//        halfOfStringArrayTest(letters6, correct6);
//        halfOfStringArrayTest(letters7, correct7);
//        halfOfStringArrayTest(letters8, correct8);
        String empty = "";
        String emptyExpected = "";
        String word1 = "wwEEq";
        String expectedWord1 = "2w2E1q";
        String word2 = "234450";
        String expectedWord2 = "1213241510";
        String word3 = "@*%$";
        String expectedWord3 = "1@1*1%1$";
        String word4 = "d";
        String expectedWord4 = "1d";
        String word5 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String expectedWord5 = "35a";
        String word6 = null;
        String expectedWord6 = "null";
        archLettersTest(empty, emptyExpected);
        archLettersTest(word1, expectedWord1);
        archLettersTest(word2, expectedWord2);
        archLettersTest(word3, expectedWord3);
        archLettersTest(word4, expectedWord4);
        archLettersTest(word5, expectedWord5);
        archLettersTest(word6, expectedWord6);
    }

    public static void archLettersTest(String actual, String expected) {
        if (actual == null) { //todo in test!
          return;
        }
        if (archLetters(actual).equals(expected)){
            System.out.println("Test true");
        }
        else {
            System.out.println("Test false");
        }
    }

    public static void halfOfStringArrayTest(String[] input, String[] expected) {
        String[] result = halfOfStringArray(input);
        if (Arrays.equals(result, expected)) {
            System.out.println("Test true");
        } else {
            System.out.println("Test false");
        }
    }

    public static String[] halfOfStringArray(String[] letters) {
        int length = letters.length;
        int halflength = length / 2;
        String result[] = new String[halflength];
        for (int i = 0; i < halflength; i++) {
            result[i] = letters[i];
        }
        return result;
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

    public static int[] halfOfArray(int[] num) {
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
    public static String archLetters(String letters){
        // проверка входных данных
        if (letters == null) {
            return null;
        }
        if (letters.isEmpty()) {
            return letters;
        }

        // обьект класса для сборки результирующей строки
        StringBuilder result = new StringBuilder();
        int count = 1;
        char previous;
        char current;
        for (int i = 1; i < letters.length(); i++) {
            current = letters.charAt(i);
            previous = letters.charAt(i - 1);
            if (current == previous) {
                count++;
            } else {
                result.append(count).append(previous);
                count = 1;
            }
        }
        result.append(count).append(letters.charAt(letters.length() - 1));
        return result.toString();
    }

}
