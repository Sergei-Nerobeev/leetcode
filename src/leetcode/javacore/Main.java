package leetcode.javacore;

public class Main {
    public static void main(String[] args) {
        var car = new Car("Lada", 100);
        var bike = new Bike("Lada", 100);
        System.out.println(car.hashCode());
        System.out.println(bike.hashCode());
        System.out.println(bike.equals(car));
    }
}
