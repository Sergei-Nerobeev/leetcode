package leetcode.arrays.task1;

import java.util.Arrays;

public class LowArray {

    private final int arrLength;
    private final int[] lowArr;

    public LowArray(int arrLength) {
        this.arrLength = arrLength;
        lowArr = new int[arrLength];
    }

    public void print() { // печать
        for (int index = 0; index < lowArr.length; index++) {
            System.out.print(lowArr[index] + " ");
        }
    }

    public int[] fill(int num) { // заполнение
        for (int index = 0; index < lowArr.length; index++) { //заполняет весь массив по порядку
            lowArr[index] = num;
            num++;
        }
        return Arrays.stream(lowArr).toArray();
    }

    public void setNumber(int index, int number) { // заполнение
         lowArr[index] = number;
    }
    public int getNumber(int index){ // чтение
        return lowArr[index];
    }


        public void coolSearch(int num) { // todo поиск определенного значения
            for (int index = 0; index < lowArr.length; index++) {
                if (lowArr[index] == num) {
                    System.out.println(num + " found!");
                    break;
                } if (num == arrLength) {
                    System.out.println("Cant find " + num);
                    break;
                }  {
                    System.out.println(num + " found!");
                }
            }
        }

    public void delete(int num) { // удаление определенного значения
        for (int index = 0; index < lowArr.length; index++) {
            if (num == lowArr[index]) {
                lowArr[index] = 0;
                break;
            }  else if (num != lowArr[index]){
                System.out.println(num + " not found for delete!");
                break;
            }
        }
    }
}

