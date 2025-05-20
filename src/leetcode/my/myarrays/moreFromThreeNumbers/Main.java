package leetcode.my.myarrays.moreFromThreeNumbers;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    System.out.println(Arrays.toString(moreNumber(4, 3, 2)));
  }

//  public static int[] moreNumber2(int a, int b, int c) {
//    int[] numbers = {a, b, c};
//    int minNumber = 0;
//    for (int i = 0; i < numbers.length - 1; i++) {
//      if (numbers[i] < numbers[i + 1]) {
//        minNumber = numbers[i];
//        numbers[i] = numbers[i + 1];
//        numbers[i + 1] = minNumber;
//      }
//      else {
//        minNumber = numbers[i+1];
//      }
//    }
//    return numbers;
//  }

  public static int[] moreNumber(int a, int b, int c) {
    int[] numbers = {a, b, c};
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length - 1; j++) {
        if (numbers[j] > numbers[j + 1]) { // Сортировка по возрастанию
          int temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
    return numbers;
  }

}


