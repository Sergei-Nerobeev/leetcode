package leetcode.my.myarrays;


public class Patient {
    Patient previous;
    String name;

    public Patient(Patient previous, String name) {
        this.previous = previous;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "previous=" + previous +
                ", name='" + name + '\'' +
                '}';
    }
}


