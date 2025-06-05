package leetcode.stepik.javatrenager.part4;

import java.util.Scanner;

/*
*У вас есть переменная stars, которая содержит входные пользовательские данные.
Значение переменной stars от 1 до 5.
1 — ★
2 — ★★
3 — ★★★
4 — ★★★★
5 — ★★★★★
Напишите код, который проверяет значение переменной stars и записывает результат в переменную result.
Sample Input 1:
1
Sample Output 1:
★
Sample Input 2:
Sample Output 2:
★★★★★
* */
public class StarToNumber {
    public static void main(String[] args) {
        int stars = readInput();

        String result = "★".repeat(stars);


        System.out.println(result);
    }

    public static int readInput() {
        int stars = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            stars = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return stars;
    }
}


