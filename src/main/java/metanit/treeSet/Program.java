package metanit.treeSet;

import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        TreeSet<String> states = new TreeSet<String>();

        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
        states.add("Great Britain");

        System.out.println(states.first());
        System.out.println(states.last());
        System.out.println(states);

        SortedSet<String> set = states.subSet("Germany", "Italy");
        System.out.println(set);

        String greater = states.higher("Germany");

        String lower = states.lower("Germany");

        NavigableSet<String> navSet = states.descendingSet();

        SortedSet<String> setLower = states.headSet("Germany");

        SortedSet<String> setGreater = states.tailSet("Germany");

        System.out.println(navSet);
        System.out.println(setLower);
        System.out.println(setGreater);
    }
}
