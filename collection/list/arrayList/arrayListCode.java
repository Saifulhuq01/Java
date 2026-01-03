package collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import collection.comparatorVsComparable.comparator;

public class arrayListCode {
    public static void main(String[] args) {
        System.out.println("ArrayList Code");
        List<Integer> list1 = new ArrayList<>();
        list1.add(0, 10);
        list1.add(1, 20);
        list1.add(2, 30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0, 40);
        list2.add(1, 50);
        list2.add(2, 60);

        list1.addAll(1, list2);

        for (Integer integer : list1) {
            System.out.print(integer + ", ");
            // 10, 40, 50, 60, 20, 30, 
        }
        
        list1.sort(null);  
        System.out.println("\nAfter Sorting:");
        for (Integer integer : list1) {
            System.out.print(integer + ", ");
        }

        list1.remove(2);
        System.out.println("\nAfter Removing index 2:");
        for (Integer integer : list1) {
            System.out.print(integer + ", ");
        }

        list1.add(2, 70);
        System.out.println("\nAfter Adding 70 at index 2:");
        for (Integer integer : list1) {
            System.out.print(integer + ", ");
        }

        list1.set(3, 80);
        System.out.println("\nAfter Setting index 3 to 80: replaced 40 with 80");
        for (Integer integer : list1) {
            System.out.print(integer + ", ");
        }

        // forward traversal using ListIterator
        ListIterator<Integer> listIterator = list1.listIterator();
        System.out.println("\nUsing ListIterator to traverse the list:");
        while (listIterator.hasNext()) {
            int val = listIterator.next();
            System.out.print("traverse forward: " + val + " next index: " + listIterator.nextIndex() + ",previous index: " + listIterator.previousIndex() + "\n");

            if (val == 80) {
                listIterator.add(-90);
                System.out.println("After adding -90 at index " + listIterator.previousIndex());
            }
        }

        System.out.println("===================================================");

        // backward traversal using ListIterator
        ListIterator<Integer> listIterator2 = list1.listIterator(list1.size());
        while (listIterator2.hasPrevious()) {
            int previousVal = listIterator2.previous();
            System.out.println("traverse backward " + previousVal +" next index: "+ listIterator2.nextIndex() + " previous index:" + listIterator2.previousIndex());

            if (previousVal == 70) {
                listIterator2.set(-100);
                System.out.println("After setting -100 at index " + listIterator2.nextIndex());
            }
        }
    }
}
