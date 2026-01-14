package collection.map.trees;

import java.net.Socket;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class treesCode {
    public static void main(String[] args) {
        System.out.println("TreeMap in descending order:");
        Map<Integer,String> treeMap = new TreeMap<>((Integer key1, Integer key2) -> key2 - key1);
        treeMap.put(1, "Apple");
        treeMap.put(3, "Banana");
        treeMap.put(2, "Cherry");
        treeMap.put(10, "Date");
        treeMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println("TreeMap in ascending order:");
        Map<Integer,String> treeMap1 = new TreeMap<>();
        treeMap1.put(1, "Apple");
        treeMap1.put(3, "Banana");
        treeMap1.put(2, "Cherry");
        treeMap1.put(10, "Date");
        treeMap1.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println("TreeMap with sortedmap extends:");
        SortedMap <Integer,String> sortedMap = new TreeMap<>();
        sortedMap.put(1, "Apple");
        sortedMap.put(3, "Banana");
        sortedMap.put(2, "Cherry");
        sortedMap.put(10, "Date");

        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(3));
        System.out.println(sortedMap.tailMap(3));

        System.out.println("navigable map methods:");
        NavigableMap<Integer,String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "Apple");
        navigableMap.put(21, "Banana");
        navigableMap.put(23, "Cherry");
        navigableMap.put(141, "Date");
        navigableMap.put(25, "Fig");

        System.out.println("lowerEntry: " + navigableMap.lowerEntry(23));
        System.out.println("lowerKey: " + navigableMap.lowerKey(23));
        System.out.println("ceilingEntry: " + navigableMap.ceilingEntry(23));
        System.out.println("ceilingKey: " + navigableMap.ceilingKey(23));
        System.out.println("higherEntry: " + navigableMap.higherEntry(23));
        System.out.println("higherKey: " + navigableMap.higherKey(23));
        System.out.println("floorEntry: " + navigableMap.floorEntry(23));
        System.out.println("floorKey: " + navigableMap.floorKey(23));
        System.out.println("pollFirstEntry: " + navigableMap.pollFirstEntry());
        System.out.println("pollLastEntry: " + navigableMap.pollLastEntry());
        System.out.println("NavigableMap after polling: " + navigableMap);
        System.out.println("new insertions:");
        navigableMap.put(1, "Apple");
        navigableMap.put(141, "Date");
        System.out.println("NavigableMap after insertion: " + navigableMap);
        System.out.println("descendingMap: " + navigableMap.descendingMap());
        System.out.println("navigableKeySet: " + navigableMap.navigableKeySet());
        System.out.println("descendingKeySet: " + navigableMap.descendingKeySet());
        System.out.println("headMap(25,true): " + navigableMap.headMap(25, true));
        System.out.println("headMap(25,false): " + navigableMap.headMap(25, false));
        System.out.println("tailMap(21,true): " + navigableMap.tailMap(21, true));
        System.out.println("tailMap(21,false): " + navigableMap.tailMap(21, false));

    }
}
