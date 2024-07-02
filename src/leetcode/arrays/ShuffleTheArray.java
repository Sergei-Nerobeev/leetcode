package leetcode.arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};

        int[] nums2 = new int[]{1, 1, 2, 2};
        System.out.println(Arrays.toString(shuffle(nums2, 2)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int [] result = new int[2 * n];
        for (int i = 0; i < nums.length; i++) {
           result[n * i] = nums[i];
           result[n * i + 1] = nums[n + 1];


        }
        return result;
    }


}
