package tasks.lessons.massive.task1;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        LowArray lowArray = new LowArray(10);
        System.out.println(Arrays.toString(lowArray.fill(2)));
        System.out.println(lowArray.search(9));
        lowArray.delete(1);
        lowArray.print();


    }
}
