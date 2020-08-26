package metanit.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare (Person a, Person b){
        return a.getName().compareTo(b.getName());
    }
    public static void main(String[] args) {

        PersonComparator pcomp = new PersonComparator();
        TreeSet<Person> people = new TreeSet<>(pcomp);
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        people.add(new Person("Alice"));
        people.add(new Person("Bill"));
        for (Person p : people) {

            System.out.println(p.getName());
        }
    }
}
