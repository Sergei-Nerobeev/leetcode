package leetcode.my.task4;


public class Main {
    public static void main(String[] args) {
        //создать метод поиска минимума в массиве
    long[] numbers = {100, 5, 9 ,0, -34};
        System.out.println(minElement(numbers));
        System.out.println(maxElement(numbers));

    }

    public static long minElement(long[] nums) {
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Null or empty array!");
        }
        long min = nums[0]; // взять первый
       // long minNum = Long.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    public static long maxElement(long[] nums) {
        long max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }



}
