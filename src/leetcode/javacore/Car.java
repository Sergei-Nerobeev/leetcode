package leetcode.javacore;

import java.util.Objects;

public class Car {
    private String title;
    private int speed;

    public Car(String title,int speed) {
        this.speed = speed;
        this.title = title;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return speed == car.speed && Objects.equals(title, car.title);
//    }
//
    @Override
    public int hashCode() {
        return Objects.hash(title, speed);
    }
}
