package leetcode.arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};

        int[] nums2 = new int[]{1, 1, 2, 2};
        System.out.println(Arrays.toString(shuffle(nums2, 2)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int temp = 0;
        int [] result = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            temp = nums[i + 1];
            nums[i + 1] = nums[i + 2];
            nums[i + 2] = temp;
        }
        return nums;
    }


}
