package leetcode.algoritms;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

    int[] numbers = {2, 6, 4, 8, 2, 4, 5, 12, 9};
    int[] result = twoSum(numbers, 12);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
