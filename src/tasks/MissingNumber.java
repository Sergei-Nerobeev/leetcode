package tasks;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 0, 1};
        System.out.println(MissingNumber.missingNumber(numbers));
    }

    public static int missingNumber(int[] numbers) {  // O n 2

        for (int temp = 0; temp < numbers.length; temp++) {
            if (!isNumberIn(numbers, temp)) {
                return temp;
            }
        }
        return numbers.length;
    }

    public static boolean isNumberIn(int[] numbers, int temp) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == temp) {
                return true;
            }
        }
        return false;
    }
}
