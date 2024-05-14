package tasks.lessons.massive.task1;

public class Runner {
    public static void main(String[] args) {

        LowArray lowArray = new LowArray(6);
        lowArray.setNumber(0,20);
        lowArray.setNumber(1,30);
        lowArray.setNumber(2,40);
        lowArray.setNumber(3,50);
        lowArray.setNumber(4,60);
        lowArray.setNumber(5,70);
        System.out.println(lowArray.getNumber(1));
        lowArray.coolSearch(80);
        lowArray.print();




    }
}
