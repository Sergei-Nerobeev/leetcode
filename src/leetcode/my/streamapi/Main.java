package leetcode.my.streamapi;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    List<Integer> squares = numbers.stream()
                                   .map(n -> n * n)
                                   .filter(n -> n > 10)
                                   .toList();
    System.out.println(squares);

    List<String> names = Arrays.asList("Bob", "John", "Charlie", "David");
    int longestName = names.stream().mapToInt(String::length).max().orElse(0);
    System.out.println(longestName);

//    List<Integer> num = numbers.stream()
  }
}
