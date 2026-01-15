package collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class hashSetCode {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(10);
        hashSet1.add(20);
        hashSet1.add(30);
        hashSet1.add(40);
        hashSet1.add(50);
        hashSet1.forEach((Integer k)-> System.out.println("set1 " + k));

        System.out.println("-------------------");
        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(10);
        hashSet2.add(20);
        hashSet2.add(30);
        hashSet2.add(80);
        hashSet2.forEach((Integer k)-> System.out.println("set2 " + k));

        hashSet1.addAll(hashSet2);
        System.out.println("After adding set2 to set1:");
        hashSet1.forEach((Integer k)-> System.out.println(k));

        hashSet1.remove(30);
        System.out.println("After removing 30 from set1:");
        hashSet1.forEach((Integer k)-> System.out.println(k));

        hashSet1.retainAll(hashSet2);
        System.out.println("After retaining only elements present in set2:");
        hashSet1.forEach((Integer k)-> System.out.println(k));

        hashSet1.removeAll(hashSet2);
        System.out.println("After removing all elements of set2 from set1:");
        hashSet1.forEach((Integer k)-> System.out.println(k));
    }
}
