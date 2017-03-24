
/**
 * Created by Dave on 3/24/17.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Example {

    public static void main(String[] args) {

        // this creates  a default HashMap with default initial capacity (16) and a default load factor (0.75)
        HashMap <Integer, String> hashMap = new HashMap<>();

        // add some stuff
        hashMap.put(1, "Katie");
        hashMap.put(-2, "Got");
        hashMap.put(0, "Into");
        hashMap.put(3, "Villanova");
        hashMap.put(10, "OMG");

        System.out.println("hashMap is empty? " + hashMap.isEmpty());
        System.out.println("hashMap has " + hashMap.size() + " items");

        // Iterator is complicated
        Iterator iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }


        // for loop is simple
        for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println("This is the key " + key + " this is the value " + value);

        }

        // get just the values
        for (Object value : hashMap.values()) {
            System.out.println("Value = " + value);
        }

        // get just the keys
        for (Integer key: hashMap.keySet()) {
            System.out.println("Key = " + key);
        }


        // Now Let's try a treeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "A");
        treeMap.put(9, "B");
        treeMap.put(8, "C");

        // iterate over treeMap
        Iterator it = treeMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair2 = (Map.Entry) it.next();
            System.out.println(pair2.getKey() + " = " + pair2.getValue());
        }



    }
}
