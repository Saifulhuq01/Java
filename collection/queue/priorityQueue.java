package collection.queue;

import java.util.PriorityQueue;

public class priorityQueue {

    public static void main(String[] args) {
        System.out.println("================================ Min Pq==========================================");
        
        // minPq
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        minPq.add(4);
        minPq.add(8);
        minPq.add(2);
        minPq.add(88);  

        minPq.forEach(
            (Integer val) -> 
            System.out.println(val));

        while (!minPq.isEmpty()) {
            int val = minPq.poll();
            System.out.println("remove from top " + val);
        }

        System.out.println("================================ Max Pq==========================================");
        // maxPq
        PriorityQueue<Integer> maxPq = new PriorityQueue<>((Integer a, Integer b)-> b - a);
        maxPq.add(77);
        maxPq.add(2);
        maxPq.add(477);
        maxPq.add(6);

        maxPq.forEach((Integer maxval)-> System.out.println(maxval));

       while (!maxPq.isEmpty()) {
            int maxval = maxPq.poll();
            System.out.println("remove from top " + maxval);
        }


    }
}