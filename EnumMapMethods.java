import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class EnumMapMethods {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        EnumMap<Day, String> map = new EnumMap<>(Day.class);

        // Put
        map.put(Day.SUNDAY, "Sunday");
        map.put(Day.MONDAY, "Monday");
        map.put(Day.TUESDAY, "Tuesday");
        map.put(Day.WEDNESDAY, "Wednesday");
        map.put(Day.THURSDAY, "Thursday");
        map.put(Day.FRIDAY, "Friday");
        map.put(Day.SATURDAY, "Saturday");

        System.out.println("Map:" + map);

        // Clone
        EnumMap<Day, String> map1 = new EnumMap<>(Day.class);
        map1 = (EnumMap<Day, String>) map.clone();
        System.out.println("Cloned Map:" + map1);

        // containsKey
        Boolean k = map.containsKey(Day.SUNDAY);
        System.out.println("Is SUNDAY present in the map? " + k);

        // containsValue
        Boolean v = map.containsValue("Sunday");
        System.out.println("Is Sunday present in the map? " + v);

        // get

        String g = map.get(Day.SUNDAY);
        System.out.println("Value of SUNDAY is: " + g);

        // getOrDefault

        String gd = map.getOrDefault(Day.SUNDAY, "Sunday");

        System.out.println("Value of SUNDAY is: " + gd);

        // isEmpty

        Boolean i = map.isEmpty();
        System.out.println("Is the map empty? " + i);

        // keySet
        Set<Day> set = map.keySet();
        System.out.println("Keys of the map are: " + set);

        // size
        int s = map.size();
        System.out.println("Size of the map is: " + s);

        // values
        Collection<String> col = map.values();
        System.out.println("Values of the map are: " + col);

        // entrySet
        Set<Map.Entry<Day, String>> set1 = map.entrySet();
        System.out.println("Entries of the map are: " + set1);

        // equals
        Boolean e = map.equals(map1);
        System.out.println("Is map equal to map1? " + e);

        // hashCode
        int h = map.hashCode();
        System.out.println("Hashcode of the map is: " + h);

        // toString
        String t = map.toString();
        System.out.println("String representation of the map is: " + t);

        // clear
        map.clear();
        System.out.println("Map after clear:" + map);

        // putAll
        map.putAll(map1);
        System.out.println("Map after putAll:" + map);

        // remove
        map.remove(Day.SUNDAY);
        System.out.println("Map after remove:" + map);

        // replace
        map.replace(Day.SUNDAY, "Sunday");
        System.out.println("Map after replace:" + map);

        // replaceAll
        map.replaceAll((k1, v1) -> "Sunday");
        System.out.println("Map after replaceAll:" + map);
       
        // merge
        map.merge(Day.SATURDAY, "Sunday", (v2, v3) -> "Saturday");
        System.out.println("Map after merge:" + map);
        map.merge(Day.FRIDAY, "Sunday", (v2, v3) -> "Friday");
        System.out.println("Map after merge:" + map);

        // forEach

        map.forEach((k1, v1) -> System.out.println("Key: " + k1 + " Value: " + v1));

        // replace(K key, V oldValue, V newValue)          
        map.replace(Day.SATURDAY, "Saturday", "Sunday");
        System.out.println("Map after replaceIfSame:" + map);


        // putIfAbsent(K key, V value)

        map.putIfAbsent(Day.SUNDAY, "Sunday");
        System.out.println("Map after putIfAbsent:" + map);

        // remove(K key, V value)
        map.remove(Day.SUNDAY, "Sunday");
        System.out.println("Map after remove:" + map);
        

        // computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)

        map.computeIfAbsent(Day.SUNDAY, k1 -> "Sunday");
        System.out.println("Map after computeIfAbsent:" + map);  
        
        // computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)

        map.computeIfPresent(Day.SUNDAY, (k1, v1) -> "Sunday");
        System.out.println("Map after computeIfPresent:" + map);

        // compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
        map.compute(Day.SUNDAY, (k1, v1) -> "Sunday");
        System.out.println("Map after compute:" + map);

    

    }
}
