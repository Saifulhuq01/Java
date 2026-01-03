package collection.list.linkedList;

import java.util.LinkedList;

public class linkedListCode {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //queue functionality
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addFirst(50);
        System.out.println("LinkedList: " + list);
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());


        // using list functionality
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(0, 60);
        list2.add(1, 70);
        list.addAll(2, list2);
        System.out.println("After adding list2 at index 2: " + list);
        
        // stack functionality
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println("Stack (LinkedList): " + stack);
    }
}
