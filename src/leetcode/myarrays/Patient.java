package leetcode.myarrays;


public class Patient {
    Patient previous;
    String name;

    public Patient(Patient previous, String name) {
        this.previous = previous;
        this.name = name;
    }

    public Patient getPrevious() {
        return previous;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "{" +
                "previous=" + previous +
                ", name='" + name + '\'' +
                '}';
    }
}


