package leetcode.my.myarrays.bubblesort;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class BubbleSortTestGroupWithX {

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

  @Test
  public void bubbleSortAscendingTest() {

    int[] input = {4000, 2, 70, 900};
    int[] expected = {2, 70, 900, 4000};

    int[] result = bubbleSort(input);

    assertArrayEquals(expected, result);

  }

  @Test
  public void bubbleSortSingleElementTest() {

    int[] input = {4000};
    int[] expected = {4000};

    int[] result = bubbleSort(input);

    assertArrayEquals(expected, result);

  }

  @Test
  public void bubbleSortIsEmptyTest() {

    int[] input = {};

    assertThrows(
        NoSuchElementException.class, () -> {
          bubbleSort(input);

          throw new NoSuchElementException("Array is empty");
        }
    );
  }
}
