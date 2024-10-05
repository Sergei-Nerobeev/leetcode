package leetcode.my.task4;

import static leetcode.my.task4.Main.minElement;

public class Test {
    public static void main(String[] args) {
        minElementTestSuccess();
        minElementTestNullElement();
    }

    static void minElementTestSuccess() {
        long[] numbers = {2, 4, -34, 567};
        long expected = -34;

        long actual = minElement(numbers);

        if (expected != actual) {
            throw new AssertionError("Numbers are not equal");
        } else {
            System.out.println("Test is good!");
        }
    }

    static void minElementTestNullElement() {
        long[] numbers = {};

        try {
            minElement(numbers);
        } catch (IllegalArgumentException exception) {

            if ("Null or empty array!".equals(exception.getMessage())) {
                System.out.println("Test is good!");
                return;
            }
        } catch (Exception exception) {
            throw new AssertionError("Wrong exception!");
        }
        throw new AssertionError("No exception");
    }
    // min first and min last
}
