package leetcode.livecoding.sber.task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static leetcode.livecoding.sber.task1.Person.unique;

public class PersonTest {
    @Test
    public void test() {
        List<Person> persons = new ArrayList ();
        persons.add(new Person(1,"Ivan","Vasya","Petr"));
        persons.add(new Person(2,"Ivan","Vasya","Petr"));
        persons.add(new Person(3,"Ivan","Vasya","Petr"));
        persons.add(new Person(4,"Ivan","Gupta","Ivan"));
        persons.add(new Person(5,"Petr","Rama","Igor"));
        Collection<Person> uniquePersons = unique(persons);
        assert uniquePersons.size() == 3;
    }

}
