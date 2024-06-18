package leetcode.arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {

        int[] nums = {2, 0, 1};
        int[] result = buildArray(nums);
        // Вывод результата
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {

            // nums[i] дает индекс для доступа к элементу в nums
            // nums[nums[i]] дает элемент в nums по индексу nums[i]
//            Итерация по каждому элементу массива nums
//            Для i = 0:
//
//            nums[0] = 2 (значение элемента массива nums на позиции 0).
//            Теперь нам нужно найти элемент массива nums на позиции nums[0], то есть nums[2].
//                    nums[2] = 1 (значение элемента массива nums на позиции 2).
//            Следовательно, ans[0] = 1.
//            Для i = 1:
//
//            nums[1] = 0 (значение элемента массива nums на позиции 1).
//            Теперь нам нужно найти элемент массива nums на позиции nums[1], то есть nums[0].
//                    nums[0] = 2 (значение элемента массива nums на позиции 0).
//            Следовательно, ans[1] = 2.
//            Для i = 2:
//
//            nums[2] = 1 (значение элемента массива nums на позиции 2).
//            Теперь нам нужно найти элемент массива nums на позиции nums[2], то есть nums[1].
//                    nums[1] = 0 (значение элемента массива nums на позиции 1).
//            Следовательно, ans[2] = 0.
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}

