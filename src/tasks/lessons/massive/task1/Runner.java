package tasks.lessons.massive.task1;

public class Runner {
    public static void main(String[] args) {

        LowArray lowArray = new LowArray(10);
        var totalArr = lowArray.fill(2);
        var totalArr1 = lowArray.fill(3);
        System.out.println(totalArr);
        System.out.println(totalArr1);

    }
}
