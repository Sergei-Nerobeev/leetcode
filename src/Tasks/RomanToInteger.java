package Tasks;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        int integerValue = romanToInteger("III");
        System.out.println(integerValue);
    }

    public static Map<String, Integer> createRomanToIntegerMap() {
        Map<String, Integer> integerValues = new HashMap<>();
        integerValues.put("I", 1);
        integerValues.put("V", 5);
        integerValues.put("X", 10);
        integerValues.put("L", 50);
        integerValues.put("C", 100);
        integerValues.put("D", 500);
        integerValues.put("M", 1000);
        return integerValues;
    }

    public static int romanToInteger(String romanNumber) {
        int resultDigit = 0;
        int maxDigit = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            String stringSymbol = String.valueOf(romanNumber.charAt(i));
            int currentDigit = createRomanToIntegerMap().get(stringSymbol);

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
