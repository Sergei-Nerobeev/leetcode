package leetcode.livecoding.sber.task1;


import java.util.*;

public class Person {
    public Integer id;
    public String firstName;
    public String secondName;
    public String patronymicName;

    public Person(Integer id, String firstName, String secondName, String patronymicName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymicName = patronymicName;
    }

    //Unique collection by combination first-second-patronymicName
    public static Collection<Person> unique(List<Person> persons) {
        Set<Person> filteredPersons = new HashSet<>();
        for (Person uniquePerson : persons) {
            if (persons != null) {
                filteredPersons.add(uniquePerson);
            }
        }
        return filteredPersons;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(secondName, person.secondName) && Objects.equals(patronymicName, person.patronymicName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, patronymicName);
    }
}

