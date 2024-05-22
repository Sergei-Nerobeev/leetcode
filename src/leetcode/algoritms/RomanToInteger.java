package leetcode.algoritms;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        int integerValue = romanToInteger("III");
        System.out.println(integerValue);
    }

    public static Map<Character, Integer> createRomanToIntegerMap() {
        Map<Character, Integer> integerValues = new HashMap<>();
        integerValues.put('I', 1);
        integerValues.put('V', 5);
        integerValues.put('X', 10);
        integerValues.put('L', 50);
        integerValues.put('C', 100);
        integerValues.put('D', 500);
        integerValues.put('M', 1000);
        return integerValues;
    }

    public static int romanToInteger(String romanNumber) {
        var romanToInteger = createRomanToIntegerMap();
        int resultDigit = 0;
        int maxDigit = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            Character character = romanNumber.charAt(i);
            int currentDigit = romanToInteger.get(character);

            if (currentDigit >= maxDigit) {
                resultDigit += currentDigit;

            } else {
                resultDigit -= currentDigit;
            }
            maxDigit = currentDigit;
        }
        return resultDigit;
    }
}
