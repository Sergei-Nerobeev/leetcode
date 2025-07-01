package leetcode.my.task4;

import static leetcode.my.task4.Main.minElement;

public class Test {
    public static void main(String[] args) {
        minElementTestSuccess();
        minElementTestNullElement();
        borderCheck();
    }

    static void minElementTestSuccess() {
        long[] numbers = {2, 4, -34, 567};
        long expected = -34;

        long actual = minElement(numbers);

        if (expected != actual) {
            throw new AssertionError("Numbers are not equal");
        } else {
            System.out.println("GroupCheckerTest is good!");
        }
    }

    static void minElementTestNullElement() {
        long[] numbers = {};

        try {
            minElement(numbers);
        } catch (IllegalArgumentException exception) {

            if ("Null or empty array!".equals(exception.getMessage())) {
                System.out.println("GroupCheckerTest is good!");
                return;
            }
        } catch (Exception exception) {
            throw new AssertionError("Wrong exception!");
        }
        throw new AssertionError("No exception");
    }

    // min first and min last
    static void borderCheck() {
        long[] numbers = {6, 34, -3, 569778};
        var expected = 5;
        var actual = minElement(numbers);
        for (int i = 0; i < numbers.length; i++) { // ???
            if (actual == expected) {
                System.out.println("First number is: " + expected);
                break;
            }
            } System.out.println("Wrong number");
    }
}

