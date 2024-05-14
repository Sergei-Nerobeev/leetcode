package tasks.lessons.massive.task1;

import java.util.Arrays;

public class LowArray {

    private final int arrLength;
    private int[] lowArr;

    public LowArray(int arrLength) {
        this.arrLength = arrLength;
        lowArr = new int[arrLength];
    }

    public void print() { // печать
        for (int index = 0; index < lowArr.length; index++) {
            System.out.println(lowArr[index] + " ");
        }
    }

    public int[] fill(int num) { // заполнение
        for (int index = 0; index < lowArr.length; index++) { //заполняет весь массив по порядку
            lowArr[index] = num;
            num++;
        }
        return Arrays.stream(lowArr).toArray();
    }

    public boolean search(int num) { // поиск определенного значения
        for (int index = 0; index < lowArr.length; index++) {
            if (lowArr[index] == num) {
                return true;
            }
        }
        return false;
    }

    public void delete(int index) { // удаление определенного значения
        if (lowArr[index] == index) {
            lowArr[index] = 0;
        } else {
            throw new RuntimeException("This " + index + " is wrong!");
        }
    }
}
