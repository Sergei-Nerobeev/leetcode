package leetcode.my.myarrays;

public class Main {
    public static void main(String[] args) {

        var head = new Patient(null, "Bob");
        var one = new Patient(head, "Nikola");
        var second = new Patient(one, "Lisa");
        var me = new Patient(null, "Me");

        printIt(second);
        paste(one, me.name);
        printIt(second);
        paste(second, me.name);
        printIt(second);
    }

    public static void paste(Patient patient, String name) {
        Patient newPatient = new Patient(patient.previous, name);
        patient.previous = newPatient;
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
