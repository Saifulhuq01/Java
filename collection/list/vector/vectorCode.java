package collection.list.vector;

import java.util.Vector;

public class vectorCode {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(0,10);
        vector.add(1,20);
        vector.add(2,30);
        System.out.println(vector.get(1));
    }
}
