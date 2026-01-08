package collection.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class hashMapCode {
    public static void main(String[] args) {
        Map<Integer,String> rollNumberVsNameMap = new HashMap<>();
//        HashMap<>(17); this is a manually capacity but now HashMap<>() -> is only 16(DEFAULT_INITIAL_CAPACITY = 16;) 0-15
        rollNumberVsNameMap.put(null,"Test");
//        put(null,"Test"); -> null / size(capacity) -> hash(null)/ 16 = some value like 2 is a path of this put;
        rollNumberVsNameMap.put(0,null);
        rollNumberVsNameMap.put(1,"A");
        rollNumberVsNameMap.put(2,"B");

//        compute is present
        rollNumberVsNameMap.putIfAbsent(null,"test"); //this key and value already in table so skip
        rollNumberVsNameMap.putIfAbsent(0,"ZRO"); //this key is present but value no so overright
        rollNumberVsNameMap.putIfAbsent(3,"C"); // both not in table so put in table

//        entrySet() is a method provided by the Map interface that returns a Set view
//        of the key-value mappings (or entries) contained within the map.
//        Each element in this returned Set is an object of type Map.Entry<K, V>, which represents a single key-value pair.
        for (Map.Entry<Integer,String> entryMap : rollNumberVsNameMap.entrySet()){
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("key "+ key + " value "+ value);
        }

        System.out.println("contain keys " + rollNumberVsNameMap.containsKey(3) );
        System.out.println("get(1) :"+ rollNumberVsNameMap.get(1) );

        for (Integer key: rollNumberVsNameMap.keySet()){
            System.out.println("key: "+ key);
        }

        for (String values: rollNumberVsNameMap.values()){
            System.out.println("values: " + values);
        }

    }
}
