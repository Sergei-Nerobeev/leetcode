package leetcode.my.task5;

import static leetcode.my.task5.BinarySearch.findIndex;

public class BinarySearchTest {
    public static void main(String[] args) {
        findIndex_Success();
        findIndex_IndexNotFound();
        findIndex_EmptyArray();
    }

    static void findIndex_Success() {
        int[] numbers = {-5, 0, 4, 9, 23, 789};
        int numb = 0;

        int numbIndex = findIndex(numbers, numb);

        if (numbIndex != 1) {
            throw new AssertionError("Wrong index");
        }
        System.out.println("Good test");

    }
    static void findIndex_IndexNotFound() {
        int[] numbers = {-5, 0, 4, 9, 23, 789};
        int numb = 100;
        int expectedIndex = -1;

        int numbIndex = findIndex(numbers, numb);

        if (numbIndex != expectedIndex) {
            throw new AssertionError("Wrong index");
        }
        System.out.println("Good test");
    }

    static void findIndex_EmptyArray() {
        int[] numbers = {};
        int numb = 100;
        int expectedIndex = -1;

        int numbIndex = findIndex(numbers, numb);

        if (numbIndex != expectedIndex) {
            throw new AssertionError("Wrong index");
        }
        System.out.println("Good test");
    }


}
