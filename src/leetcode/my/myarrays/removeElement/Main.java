package leetcode.my.myarrays.removeElement;


public class Main {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry", "mango"};

        removeFruit(fruits, "cherry");
    }

    // метод удаляет определенный фрукт из массива
    private static void removeFruit(String[] fruits, String fruit) {
        int fruitIndex = -1;
        // нахожу индекс фрукта, который нужно удалить
        for (int i = 0; i < fruits.length; i++) {
            var currentFruit = fruits[i];
            if (currentFruit.equals(fruit)) {
                fruitIndex = i;
                break;
            }
        }
        // удаляю найденный фрукт
        // положить новое значение в элемент массива по индексу fruitIndex
        // вместо фрукта установить пустую строку
        fruits[fruitIndex] = "";
        // элемент с индексом fruitIndex передвинуть на последнюю позицию массива
        for (int i = fruitIndex; i < fruits.length - 1; i++) {
            var temp = fruits[i];
            // свап элементов: i и  i + 1
            fruits[i] = fruits[i + 1];
            fruits[i + 1] = temp;

        }


        //
    }
}
