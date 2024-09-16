package leetcode.my.myarrays.reversInt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {2, 1, 3, 5, 4};
//        System.out.println(Arrays.toString(getReversInt(array)));
        System.out.println(Arrays.toString(getSorted(array)));

    }

    public static int[] getReversInt(int[] array) {
        int[] reversArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversArray[i] = array[array.length - 1 - i];
        }
        return reversArray;
    }

    public static int[] getSorted(int[] array) {
        int[] sortedArray = new int[array.length];
        int temp = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                sortedArray[i] = temp;
            }
        } return sortedArray;
    }
}
