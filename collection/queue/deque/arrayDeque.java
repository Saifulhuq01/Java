package collection.queue.deque;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class arrayDeque {
    static void main() {
        ArrayDeque<Integer> queueAndStackMethod = new ArrayDeque<>();
//        Queue(FIFO)
//        offer() calls offerlast() ,add() calls addlast();
        queueAndStackMethod.offer(1);
        queueAndStackMethod.offer(2);

//        Stack(LIFO) other methods refer websites like poll() call pollFirst(), remove() calls removeFirst()
        queueAndStackMethod.addFirst(3);
        queueAndStackMethod.addFirst(4);
        queueAndStackMethod.addFirst(5);

        System.out.println(queueAndStackMethod);
        System.out.println(queueAndStackMethod.removeFirst());
        System.out.println(queueAndStackMethod.pollLast());
        System.out.println(queueAndStackMethod);
        queueAndStackMethod.push(99);
        System.out.println(queueAndStackMethod);

    }
}
