
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentMap1 {
    public static void main(String[] args) {

        ConcurrentMap<String, String> map = new ConcurrentSkipListMap<>();
        ConcurrentMap<String, String> map1 = new ConcurrentHashMap<>();

        // put
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        map.put("6", "six");
        map.put("7", "seven");
        map.put("8", "eight");
        map.put("9", "nine");
        map.put("10", "ten");

        map1.put("1", "one");
        map1.put("2", "two");
        map1.put("3", "three");
        map1.put("4", "four");
        map1.put("5", "five");
        map1.put("6", "six");
        map1.put("7", "seven");
        map1.put("8", "eight");
        map1.put("9", "nine");
        map1.put("10", "ten");

        System.out.println("Map:" + map);
        // putIfAbsent
        map.putIfAbsent("11", "eleven");
        System.out.println("Map:" + map);
        System.out.println(" ");

        // remove
        map.remove("11");
        System.out.println("Map:" + map);
        System.out.println(" ");

        // replace
        map.replace("10", "10");
        System.out.println("Map:" + map);
        System.out.println(" ");

        // compute
        String c = map.compute("11", (k, v) -> "eleven");
        System.out.println("Value of 11 is: " + c);
        System.out.println("Map: " + map);
        System.out.println(" ");

        // computeIfAbsent
        String ca = map.computeIfAbsent("12", k -> "twelve");
        System.out.println("Value of 12 is: " + ca);
        System.out.println("Map: " + map);
        System.out.println(" ");

        // computeIfPresent
        String cp = map.computeIfPresent("12", (k, v) -> "12");
        System.out.println("Value of 12 is: " + cp);
        System.out.println("Map: " + map);
        System.out.println(" ");
        System.out.println(" ");

        // merge
        String m = map.merge("12", "twelve", (v1, v2) -> v1 + v2);
        System.out.println("Value of 12 is: " + m);
        System.out.println("Map: " + map);
        System.out.println(" ");

        // getOrDefault
        String g = map.getOrDefault("13", "thirteen");
        System.out.println("Value of 13 is: " + g);

        // isEmpty
        Boolean i = map.isEmpty();
        System.out.println("Is the map empty? " + i);
        System.out.println(" ");

        // size
        int s = map.size();
        System.out.println("Size of the map is: " + s);
        System.out.println(" ");

        // containsKey
        Boolean ck = map.containsKey("1");
        System.out.println("Does the map contain key 1? " + ck);

        // containsValue
        Boolean cv = map.containsValue("one");
        System.out.println("Does the map contain value one? " + cv);
        System.out.println(" ");

        // forEach
        map.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
        System.out.println(" ");

        // get
        String g1 = map.get("1");
        System.out.println("Value of 1 is: " + g1);
        System.out.println(" ");

        // putAll
        map.putAll(map1);
        System.out.println("Map: " + map);
        System.out.println(" ");

        // clear
        map.clear();
        System.out.println("Map: " + map);
        System.out.println(" ");

        map.putAll(map1);

        // replaceAll
        map.replaceAll((k, v) -> v.toUpperCase());
        System.out.println("Map: " + map);
        System.out.println(" ");
        

        // remove
        map.remove("1", "ONE");
        System.out.println("Map: " + map);
        System.out.println(" ");

        //entry
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        for (Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        System.out.println(" ");

        // keySet
        Set< String> set = map.keySet();
        System.out.println("Set: " + set);
        System.out.println(" ");
        
        //entrySet
        Set<Entry<String, String>> set1 = map.entrySet();
        System.out.println("Set: " + set1);
        Set<Map.Entry<String, String>> set2 = map.entrySet();
        System.out.println("Set: " + set2);
        System.out.println(" ");
       
        
        //equals
        Boolean e = map.equals(map1);
        System.out.println("Are the maps equal? " + e);

        //hashCode

        int hc = map.hashCode();
        System.out.println("Hashcode of the map is: " + hc);

        //toString
        String ts = map.toString();
        System.out.println("String of the map is: " + ts);

        //get
        String g2 = map.get("10");
        System.out.println("Value of 1 is: " + g2);

        //values
        Collection<String> c1 = map.values();
        System.out.println("Collection: " + c1);
        


    }
}
