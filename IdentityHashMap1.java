import java.util.ConcurrentModificationException;
import java.util.IdentityHashMap;
import java.util.Iterator;
public class IdentityHashMap1 {
    public static void main(String[] args) throws Exception {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();

        // Put
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);

        System.out.println("Map:" + map);
        System.out.println(" ");

        // Clone
        IdentityHashMap<String, Integer> map1 = new IdentityHashMap<>();
        map1 = (IdentityHashMap<String, Integer>) map.clone();
        System.out.println("Cloned Map:" + map1);

        System.out.println(" ");

        // containsKey
        Boolean k = map.containsKey("a");
        System.out.println("Is a present in the map? " + k);
        System.out.println(" ");

        // forEach

        map.forEach((String key, Integer value) -> {
            System.out.println(key + ":" + value);
        });
        System.out.println(" ");

        // containsValue
        Boolean v = map.containsValue(5);
        System.out.println("Is 5 present in the map? " + v);
        System.out.println(" ");

        // get
        Integer g = map.get("a");
        System.out.println("Value of a is: " + g);
        System.out.println(" ");

        // getOrDefault
        Integer gd = map.getOrDefault("a", 1);
        System.out.println("Value of a is: " + gd);
        System.out.println(" ");

        // isEmpty
        Boolean i = map.isEmpty();
        System.out.println("Is the map empty? " + i);
        System.out.println(" ");

        // keySet
        System.out.println("Keys of the map are: " + map.keySet());
        System.out.println(" ");
        map.keySet().forEach((String key) -> {
            System.out.println(key);
        });
        System.out.println(" ");

        // putAll
        IdentityHashMap<String, Integer> map2 = new IdentityHashMap<>();
        map2.putAll(map);
        System.out.println("Map2:" + map2);
        System.out.println(" ");

        // remove
        map.remove("a");
        System.out.println("Map:" + map);
        System.out.println(" ");

        // remove2
        map.remove("b", 2);
        System.out.println("Map:" + map);
        System.out.println(" ");

        // replace
        map.replace("c", 3, 30);
        System.out.println("Map:" + map);
        System.out.println(" ");

        // replace2
        map.replace("d", 40);
        System.out.println("Map:" + map);
        System.out.println(" ");

        // replaceALL
        map.replaceAll((K, V) -> V * 2);
        System.out.println("Map:" + map);
        System.out.println(" ");

        // size
        System.out.println("Size of the map is: " + map.size());
        System.out.println(" ");

        // values
        System.out.println("Values of the map are: " + map.values());
        System.out.println(" ");
        map.values().forEach((Integer value) -> {
            System.out.println(value);
        });
        System.out.println(" ");
        map.values().remove(12);
        System.out.println(" ");
        System.out.println("Values of the map are: " + map.values());
        map.values().removeAll(map.values());
        System.out.println(" ");
        System.out.println("Values of the map are: " + map.values());
        map.putAll(map1);
        System.out.println("Values of the map are: " + map.values());
        map.values().removeIf((V) -> V % 2 == 0);
        System.out.println("Values of the map are: " + map.values());
        map.values().retainAll(map1.values());
        System.out.println("Values of the map are: " + map.values());
        map.values().clear();
        System.out.println("Map:" + map);
        map.putAll(map1);
        System.out.println("Map:" + map);

        try{

            Iterator<Integer> itr = map.values().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        itr = map.values().iterator();
        while (itr.hasNext()) {
            int s = itr.next();
            if (s % 2 == 0) {
                itr.remove();
            }
        }
        }catch(ConcurrentModificationException e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println(" ");
        }
        
        System.out.println("Map:" + map);

        // putIfAbsent
        map.putIfAbsent("b", 2);
        map.putIfAbsent("d", 4);
        System.out.println("Map:" + map);
        System.out.println(" ");

        // compute
        map.compute("b", (K, V) -> V * 2);
        System.out.println("Map:" + map);
        System.out.println(" ");

        // computeIfAbsent
        map.computeIfAbsent("f", (V) -> 31);
        System.out.println("Map:" + map);
        System.out.println(" ");

        // computeIfPresent
        map.computeIfPresent("d", (K, V) -> V * 2);
        System.out.println("Map:" + map);
        System.out.println(" ");

        // entrySet
        System.out.println("Entries of the map are: " + map.entrySet());
        System.out.println(" ");
        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        System.out.println(" ");
        System.out.println(map.entrySet().size());
        Object[] arr = map.entrySet().toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }
        System.out.println(" ");
        map.entrySet().removeIf((entry) -> entry.getKey().equals("a"));
        System.out.println("After removeIf:" + map);
        System.out.println(" ");
        map.entrySet().remove(map.entrySet().iterator().next());
        System.out.println("After remove:" + map);
        System.out.println(" ");
        map.entrySet().retainAll(map1.entrySet());
        System.out.println("After retainAll:" + map);
        System.out.println(" ");
        map.putAll(map1);
        map.entrySet().removeAll(map.entrySet());
        System.out.println("After removeAll:" + map);
        System.out.println(" ");
        map.putAll(map1);
        map.entrySet().clear();
        System.out.println("After clear:" + map);
        System.out.println(" ");

        // merge
        System.out.println("Map:" + map);
        System.out.println(" ");
        map.merge("a", 1, (K, V) -> V + V);
        System.out.println("Map:" + map);
        map.merge("a", 1, (K, V) -> V + V);
        System.out.println("Map:" + map);
        map.merge("b", 2, (K, V) -> V);
        System.out.println("Map:" + map);
        map.merge("c", 3, (K, V) -> V);
        System.out.println("Map:" + map);
        map.merge("d", 4, (K, V) -> V);
        System.out.println("Map:" + map);
        map.merge("e", 5, (K, V) -> V);
        System.out.println("Map:" + map);
        map.merge("f", 6, (K, V) -> V);
        System.out.println("Map:" + map);
        map.merge("f", 6, (K, V) -> null);
        System.out.println("Map:" + map);
        map.forEach((key, value) -> map.merge(key, value, (K, V) -> V + V));
        System.out.println("Map:" + map);
        System.out.println(" ");

        // equals
        Boolean b = map.equals(map1);
        System.out.println("Equals / Not:" + b);
        System.out.println(" ");
        // hashCode
        int h = map.hashCode();
        System.out.println("HashCode:" + h);
        System.out.println(" ");

        // toString
        String s = map.toString();
        System.out.println("ToString:" + s);
        System.out.println(" ");

       

        

    }
    
}

