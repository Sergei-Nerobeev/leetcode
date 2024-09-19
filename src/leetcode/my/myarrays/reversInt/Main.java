package leetcode.my.myarrays.reversInt;


public class Main {
    public static void main(String[] args) {

        int[] array = {2, 9, 3};

        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }

    public static int[] getReversInt(int[] array) {
        int[] reversArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversArray[i] = array[array.length - 1 - i];
        }
        return reversArray;
    }

    public static void sort(int[] array) {
        // внешний цикл проходит по массиву
        for (int i = 0; i < array.length; i++) { // i = 3, 3  < 3,  {2,3,9}
            // внутренний цикл сравнивает и меняет местами
            for (int j = 1; j < array.length - i; j++) // j = 1, 1 < 1, {2,3,9}
                if (array[j] < array[j - 1]) { // 3 < 2 ,
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
    }
}
