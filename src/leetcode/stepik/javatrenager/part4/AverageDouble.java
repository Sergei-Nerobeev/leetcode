package leetcode.stepik.javatrenager.part4;

import java.util.Scanner;

/*
 * 4.1 Часть 1.
 * У вас есть переменные x1, x2, x3, которые содержат входные пользовательские данные.
Напишите код, который находит максимальное и минимальное число из x1, x2, x3 и записывает результат в переменную result.
 *
 * */
public class AverageDouble {
  public static void main(String[] args) {
    int x1, x2, x3;
    String result = "";

    int[] inputValues = readInput();
    x1 = inputValues[0];
    x2 = inputValues[1];
    x3 = inputValues[2];

    // Находим минимальное и максимальное значение
    int min = Math.min(x1, Math.min(x2, x3));
    int max = Math.max(x1, Math.max(x2, x3));
    result = "минимальное: " + min + ", максимальное: " + max;

    System.out.println(result);
  }

  public static int[] readInput() {
    int[] inputValues = new int[3];
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextLine()) {
      String input = scanner.nextLine();
      String[] values = input.split(" ");
      for (int i = 0; i < 3; i++) {
        inputValues[i] = Integer.parseInt(values[i]);
      }
    }
    scanner.close();
    return inputValues;
  }
}
