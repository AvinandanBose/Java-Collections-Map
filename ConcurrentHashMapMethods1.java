import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods1 {
    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        //put
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        map.put("6", "six");
        map.put("7", "seven");
        map.put("8", "eight");

        System.out.println("Map:" + map);

        //putIfAbsent
        map.putIfAbsent("12", "Twelve");
       System.out.println("Map:" + map);


        //remove
        map.remove("12");
        System.out.println("Map:" + map);

        map.putIfAbsent("12", "Twelve");
        System.out.println("Map:" + map);

        //remove(key, value)
        map.remove("12", "Twelve");
        System.out.println("Map:" + map);

        // replace(key, value)
        map.putIfAbsent("12", "Twelve");
        map.replace("12", "Twelve".toUpperCase());
        System.out.println("Map:" + map);

        // replace(key, oldValue, newValue)

        map.replace("12", "TWELVE", "Twelve");
        System.out.println("Map:" + map);

        // getOrDefault
        String e = map.getOrDefault("12", "Twelve");
        System.out.println("GetOrDefault:" +e);
        System.out.println("Map:" + map);

        // forEach

        map.forEach((k, v) -> System.out.println("Key:" + k + " Value:" + v));

        // computeIfAbsent
        String ca = map.computeIfAbsent("13", k -> "Thirteen".toUpperCase());
        System.out.println("Value of 13 is: " + ca);
        System.out.println("Map: " + map);

        // computeIfPresent
        String cp = map.computeIfPresent("13", (k, v) -> "Thirteen".toLowerCase());
        System.out.println("Value of 13 is: " + cp);
        System.out.println("Map: " + map);

        //compute
        String c = map.compute("14", (k, v) -> "Fourteen".toUpperCase());
        System.out.println("Value of 14 is: " + c);
        System.out.println("Map: " + map);

        //equals
        ConcurrentHashMap<String, String> map1 = new ConcurrentHashMap<>();
        map1.put("1", "one");
        map1.put("2", "two");
        map1.put("3", "three");
        map1.put("4", "four");
        map1.put("5", "five");
        map1.put("6", "six");
        map1.put("7", "seven");
        map1.put("8", "eight");
        

        Boolean b = map.equals(map1);
        System.out.println("Map equals map1: " + b);

        //merge
        String m = map.merge("15", "Fifteen", (v1, v2) -> v1.concat(v2));
        System.out.println("Value of 15 is: " + m);
        System.out.println("Map: " + map);

        //containsValue

        Boolean cv = map.containsValue("Fifteen");
        System.out.println("Map contains value Fifteen: " + cv);

        //replaceAll
        map.replaceAll((k, v) -> v.toUpperCase());
        System.out.println("Map: " + map);

        //clone or copying a ConcurrentHashMap 
        Map<String, String> copy = new ConcurrentHashMap<>(map);
        
        System.out.println("Map2: " + copy);
        //--That is passing through a constructor of ConcurrentHashMap

        //keySet
        Set<String> set = map.keySet();
        System.out.println("KeySet: " + set);

        //values
        Set<String> values = map.keySet();
        System.out.println("Values: " + values);

        //entrySet
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println("EntrySet: " + entrySet);

        //size
        int size = map.size();
        System.out.println("Size: " + size);

        //isEmpty
        Boolean empty = map.isEmpty();
        System.out.println("Map is empty: " + empty);

        //containsKey
        Boolean ck = map.containsKey("15");
        System.out.println("Map contains key 15: " + ck);

        //get
        String g = map.get("15");
        System.out.println("Value of 15 is: " + g);

        //clear
        map.clear();
        System.out.println("Map: " + map);

        //putAll
        map.putAll(map1);
        System.out.println("Map: " + map);

        //hashCode
        int hc = map.hashCode();
        System.out.println("HashCode: " + hc);

        //toString
        String ts = map.toString();
        System.out.println("ToString: " + ts);

        

        



        // ....... etc ....... of all the methods inherited from ConcurrentMap,AbstractMap,Map interfaces.

        

    }
    
}
