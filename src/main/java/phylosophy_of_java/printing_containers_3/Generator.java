package phylosophy_of_java.printing_containers_3;

import java.util.*;

public class Generator {
    static Collection fill(Collection<String> collection) {
        collection.add("Minh Nguyen ");
        collection.add("Svetlana Loboda ");
        collection.add("Alexander Zinchenko ");
        collection.add("Anyutaagh ");
        return collection;
    }

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        fill(arrayList);
        fill(linkedList);
        fill(hashSet);
        fill(linkedHashSet);
        fill(treeSet);

        Iterator<String> itArrayList = arrayList.iterator();
        Iterator<String> itLinkedList = linkedList.iterator();
        Iterator<String> itHashSet = hashSet.iterator();
        Iterator<String> itLinkedHashSet = linkedHashSet.iterator();
        Iterator<String> itTreeSet = treeSet.iterator();

        while(itArrayList.hasNext()){
            System.out.println("ArrayList: " + itArrayList.next());
        }

        while (itLinkedList.hasNext()){
            System.out.println("LinkedList: " + itLinkedList.next());
        }

        while (itHashSet.hasNext()){
            System.out.println("HashSet: " + itHashSet.next());
        }

        while (itLinkedHashSet.hasNext()){
            System.out.println("LinkedHashSet: " + itLinkedHashSet.next());
        }

        while (itTreeSet.hasNext()){
            System.out.println("TreeSet: " + itTreeSet.next());
        }
    }
}
