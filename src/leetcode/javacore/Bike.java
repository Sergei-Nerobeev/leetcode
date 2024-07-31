package leetcode.javacore;

import java.util.Objects;

public class Bike {
    private String title;
    private int speed;

    public Bike(String title, int speed) {
        this.title = title;
        this.speed = speed;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Bike bike = (Bike) o;
//        return speed == bike.speed && Objects.equals(title, bike.title);
//    }
//
    @Override
    public int hashCode() {
        return Objects.hash(title, speed);
    }
}
