package leetcode.my.iter;

import java.util.Collections;
import java.util.List;

public class TakeIter {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4};

    List<Integer> arr = new java.util.ArrayList<>(someFunction());
    System.out.println(arr);
    for (int number : numbers) {
      arr.add(number);
    }
    System.out.println(arr);

  }

  public static List<Integer> someFunction() {
    return Collections.emptyList();
  }

}
