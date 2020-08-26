package metanit.arrayListMetanit;

import java.util.ArrayList;

public class ArrayListMetanit {

    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<>();
        people.add("Sara");
        people.add("Carol");
        people.add("Bob");
        people.add("Sam");

        System.out.println(people.get(1));

        people.add(1, "Anton bogatiy");

        System.out.println(people.get(1));

        System.out.println("----------------------------");

        for (String person : people){
            System.out.println(person);
        }
        people.set(1, "Jack");

        System.out.println("-------------------------------");

        System.out.println("Size: " + people.size());
        for (String person : people){
            System.out.println(person);
        }

        if (people.contains("Sam")){
            System.out.println("ArrayList contains Sam");
        }

        people.remove("Carol");
        people.remove(0);

        System.out.println(people.size());

        Object[] peopleArray = people.toArray();

        for (Object person : peopleArray) {
            System.out.println(person);
        }
    }
}
