package collection.set.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSetCode {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(50);
        linkedHashSet.forEach((Integer k)-> System.out.println("linkedHashSet " + k));
    }
}
