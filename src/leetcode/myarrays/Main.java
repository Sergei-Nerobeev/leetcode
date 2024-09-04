package leetcode.myarrays;

public class Main {
    public static void main(String[] args) {
        var head = new Patient( null,"Bob");
        var one = new Patient(head, "Nikola");
        var second = new Patient(one,"Lisa");
        var me = new Patient(null,"Me");

    }
    public static void printList(){
        System.out.println(" ");
    }

}
