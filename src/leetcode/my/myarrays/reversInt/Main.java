package leetcode.my.myarrays.reversInt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {2, 3};
//        System.out.println(Arrays.toString(getReversInt(array)));
        System.out.println(Arrays.toString(getSorted(array)));

    }

    // переворачивает массив инт
    public static int[] getReversInt(int[] array) {
        int[] reversArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversArray[i] = array[array.length - 1 - i];
        }
        return reversArray;
    }

    // сортирует по возрастанию
    public static int[] getSorted(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            int temp;
            temp = array[0];
            if (temp < array[i]) {
                sortedArray[i - 1] = temp;
                sortedArray[i + 1] = array[i];
            }
        }
        return sortedArray;
    }
}
