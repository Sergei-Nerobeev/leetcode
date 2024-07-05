package leetcode.arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};

        int[] nums2 = new int[]{1, 1, 2, 2};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int xIndex = 0;
        int yIndex = n;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                result[i] = nums[xIndex++];
            } else {
                result[i] = nums[yIndex++];
            }
        }
        return result;
    }


}
