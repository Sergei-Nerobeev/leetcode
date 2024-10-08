package leetcode.my.task4;


public class Main {
    public static void main(String[] args) {
        //создать метод поиска минимума в массиве
    long[] numbers = {100, 5, 9 ,0, -34};
        System.out.println(minElement(numbers));
        System.out.println(maxElement(numbers));
    }

    public static long minElement(long[] numbs) {
        if(numbs == null || numbs.length == 0) {
            throw new IllegalArgumentException("Null or empty array!");
        }
        long min = numbs[0]; // взять первый
       // long minNum = Long.MAX_VALUE;
        for (int i = 1; i < numbs.length; i++) {
            if(numbs[i] < min) {
                min = numbs[i];
            }
        }
        return min;
    }
    public static long maxElement(long[] numbs) {
        long max = numbs[0];
        for (int i = 1; i < numbs.length; i++) {
            if(numbs[i] > max) {
                max = numbs[i];
            }
        }
        return max;
    }



}
