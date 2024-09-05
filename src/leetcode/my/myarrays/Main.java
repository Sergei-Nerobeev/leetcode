package leetcode.my.myarrays;

public class Main {
    public static void main(String[] args) {

        var head = new Patient(null, "Bob");
        var one = new Patient(head, "Nikola");
        var second = new Patient(one, "Lisa");
        var me = new Patient(second, "Me");

        insert(head, "Nikola", "Me");
        printIt(head);
        System.out.println("-----------------------");
        printIt(head);
    }

    public static void insert(Patient head, String targetName, String newName) {
        Patient current = head;
        while (current != null) {
            if (current.name.equals(targetName)) {
                Patient newPatient = new Patient(current.previous, newName);
                if (current.previous != null) {
                    current.previous = newPatient;
                    break;
                }
            }
            current = current.previous;
        }
    }

    public static void printIt(Patient patient) {
        int counter = 1;
        while (patient != null) {
            System.out.println("Patient: " + counter + " " + patient.name);
            patient = patient.previous;
            counter++;

        }
    }
}
