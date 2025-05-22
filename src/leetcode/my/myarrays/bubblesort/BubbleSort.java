package leetcode.my.myarrays.bubblesort;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class BubbleSort {
  public static void main(String[] args) {
    int[] numbers = {120, 70, 5};

    System.out.println(Arrays.toString(bubbleSort(numbers)));
  }

  public static int[] bubbleSort(int[] numbers) {

    var isEmpty = numbers.length;
    if (isEmpty == 0) {
      throw new NoSuchElementException("Array is empty");
    }
    for (int i = 0; i < numbers.length; i++) { // outer loop
      for (int j = 0; j < numbers.length - i - 1; j++) { // inner loop
        if (numbers[j] > numbers[j + 1]) {
          int temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
    return numbers;
  }

}


