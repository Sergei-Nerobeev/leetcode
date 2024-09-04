package leetcode.myarrays.linkedarray;

import java.util.Arrays;

public class Patient {
    Patient previous;
    String name;

    public Patient(Patient previous, String name) {
        this.previous = previous;
        this.name = name;
    }

    //метод создания нового массива
    private void createNewArrayPlusOneElement(String[] array) {
        String[] newArray;
        newArray = Arrays.copyOf(array, 4);
    }

    //метод печати массива
    public void print(String[]array){
        System.out.println(Arrays.toString(array));

    }
}


