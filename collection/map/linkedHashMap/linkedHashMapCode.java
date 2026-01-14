package collection.map.linkedHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMapCode {
    public static void main(String[] args) {

        System.out.println("============LinkedHashMap (insertion order)============");
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(131,"c");
        map.put(4,"d");
        map.put(35,"e");
        map.forEach((Integer key,String value)-> System.out.println(key+ " : "+ value));

        System.out.println("============HashMap============");
        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1,"a");
        map2.put(2,"b");
        map2.put(131,"c");
        map2.put(4,"d");
        map2.put(35,"e");
        map2.forEach((Integer key,String value)-> System.out.println(key+ " : "+ value));

        System.out.println("######################### LinkedHashMap (Access order) ##############################");
        Map<Integer,String> map3 = new LinkedHashMap<>(16,.75F, true);
        map3.put(1,"a");
        map3.put(2,"b");
        map3.put(131,"c");
        map3.put(4,"d");
        map3.put(35,"e");
        map3.get(1);
        map3.forEach((Integer key, String value)-> System.out.println(key+ " : " + value));

        //for thread safe version(reference)
        Map<Integer,String> map4 = Collections.synchronizedMap(new LinkedHashMap<>(16,.75F, true));
    }
}
