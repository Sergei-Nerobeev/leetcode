package leetcode.arrays.task2;

public class MaxVolumeMassive {
    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 10};
        System.out.println(findMaxValue(array));

    }
    public static int findMaxValue(int[] array) {
        if(array == null  || array.length == 0) {
            throw new RuntimeException("Array is empty ");
        }
        int maxValue = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        } return maxValue;
    }

}
