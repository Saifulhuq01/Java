package collection.set.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class treeSetCode {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(10);
        treeSet.forEach((Integer k)-> System.out.println("treeSet " + k));
    }
}
