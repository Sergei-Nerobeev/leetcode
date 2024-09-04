package leetcode.my.task3;

public class GaussTask {
    public static void main(String[] args) {
        int[] array = new int[101];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
//        int sum = 0;
//        int[] arrayRes = new int[5051];
//        for (int i = 0; i < arrayRes.length; i++) {
//            sum += array[i];
//            System.out.println(sum);
//        }
        int temp;
        for (int i = 0; i < array.length; i++) {
            temp = array[i] + array.length - 1;
            System.out.println(temp);
        }

    }
}
