import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentSkipListMap;
public class ConcurrentSkipListMapMethods {
    public static void main(String[] args) throws Exception {
        //Put
        ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        map.put("6", "six");
        map.put("7", "seven");


        System.out.println("Map:" + map);
        System.out.println(" ");

        //ceilingEntry​(K key)
        Map.Entry<String, String> entry = map.ceilingEntry("3");
        System.out.println("ceilingEntry:" + entry);
        Entry<String, String> entry1 = map.ceilingEntry("5");
        System.out.println("ceilingEntry:" + entry1);

        //ceilingKey​(K key)
        String key = map.ceilingKey("3");
        System.out.println("ceilingKey:" + key);
        String key1 = map.ceilingKey("2");
        System.out.println("ceilingKey:" + key1);

        // clone()
        ConcurrentSkipListMap<String, String> map1 = (ConcurrentSkipListMap<String, String>) map.clone();
        System.out.println("clone:" + map1);

        // compute(K key, BiFunction<? super K,​? super V,​? extends V> remappingFunction​)

        map1.compute("1", (k, v) -> v.toUpperCase());
        System.out.println("compute:" + map1);

        // computeIfAbsent​(K key, Function<? super K,​? extends V> mappingFunction​)
        map1.computeIfAbsent("0", k->"Zero".toUpperCase());
        System.out.println("compute:" + map1);

        // computeIfPresent​(K key, BiFunction<? super K,​? super V,​? extends V> remappingFunction​)
        map1.computeIfPresent("0", (k, v) -> v.toLowerCase());
        System.out.println("compute:" + map1);
      

        // containsKey​(Object key)
        boolean b = map1.containsKey("0");
        System.out.println("containsKey:" + b);

        // containsValue​(Object value)
        boolean b1 = map1.containsValue("zero");
        System.out.println("containsValue:" + b1);

        // entrySet()
        Set<Entry<String, String>> set = map1.entrySet();
        System.out.println("entrySet:" + set);

        // equals​(Object o)
        boolean b2 = map1.equals(map);
        System.out.println("Equals:" + b2);

        // firstEntry()
        Entry<String, String> entry2 = map1.firstEntry();
        System.out.println("firstEntry:" + entry2);

        //firstKey()
        String key2 = map1.firstKey();
        System.out.println("firstKey:" + key2);

        //floorEntry​(K key)
        Entry<String, String> entry3 = map1.floorEntry("3");
        System.out.println("floorEntry:" + entry3);

        //floorKey​(K key)
        String key3 = map1.floorKey("3");
        System.out.println("floorKey:" + key3);

        // get​(Object key)
        String value = map1.get("3");
        System.out.println("get:" + value);

        //getOrDefault​(Object key, V defaultValue)
        String value1 = map1.getOrDefault("3", "three");
        System.out.println("getOrDefault:" + value1);

        //headMap​(K toKey)
        Map<String, String> map2 =  map1.headMap("3");
        System.out.println("headMap:" + map2);

        //headMap​(K toKey, boolean inclusive)
        Map<String, String> map3 =  map1.headMap("3", true);
        System.out.println("headMap:" + map3);
        Map<String, String> map4 = map1.headMap("3", false);
        System.out.println("headMap:" + map4);

        // higherEntry​(K key)
        Entry<String, String> entry4 = map1.higherEntry("3");
        System.out.println("higherEntry:" + entry4);

        // higherKey​(K key)
        String key4 = map1.higherKey("3");
        System.out.println("higherKey:" + key4);

        // keySet()
        Set<String> set1 = map1.keySet();
        System.out.println("keySet:" + set1);

        // lastEntry()
        Entry<String, String> entry5 = map1.lastEntry();
        System.out.println("lastEntry:" + entry5);

        // lastKey()
        String key5 = map1.lastKey();
        System.out.println("lastKey:" + key5);

        // lowerEntry​(K key)
        Entry<String, String> entry6 = map1.lowerEntry("3");
        System.out.println("lowerEntry:" + entry6);

        //lowerKey​(K key)
        String key6 = map1.lowerKey("3");
        System.out.println("lowerKey:" + key6);

        //merge​(K key, V value, BiFunction<? super V,​? super V,​? extends V> remappingFunction)
        map1.merge("3", "three", (v1, v2) -> v1 + v2);
        System.out.println("merge:" + map1);

        // pollFirstEntry()
        Entry<String, String> entry7 = map1.pollFirstEntry();
        System.out.println("pollFirstEntry:" + entry7);

        // pollLastEntry()

        Entry<String, String> entry8 = map1.pollLastEntry();
        System.out.println("pollFirstEntry:" + entry8);


        // putIfAbsent​(K key, V value)
        map1.putIfAbsent("8", "Eight");
        System.out.println("putIfAbsent:" + map1);

        // remove​(Object key)
        map1.remove("8");
        System.out.println("remove:" + map1);

        //remove​(Object key, Object value)

        map1.remove("3", "threethree");
        System.out.println("remove:" + map1);

        //replace​(K key, V value)
        map1.replace("2", "TWO");
        System.out.println("replace:" + map1);

        //replace​(K key, V oldValue, V newValue)
        map1.replace("2", "TWO", "two");
        System.out.println("replace:" + map1);

        //subMap​(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)
        Map<String, String> map5 = map1.subMap("2", true, "4", true);
        System.out.println("subMap:" + map5);

        //subMap​(K fromKey, K toKey)
        Map<String, String> map6 = map1.subMap("2", "4");
        System.out.println("subMap:" + map6);// By Default toInclusive is False

        //tailMap​(K fromKey)
        Map<String, String> map7 = map1.tailMap("2");
        System.out.println("tailMap:" + map7);

        // tailMap​(K fromKey, boolean inclusive)
        Map<String, String> map8 = map1.tailMap("2", true);
        System.out.println("tailMap:" + map8);

        //values()
        Collection<String> collection = map1.values();
        System.out.println("values:" + collection);

        /* java.util.AbstractMap -- Methods*/

        // hashCode()
        int hashCode = map1.hashCode();
        System.out.println("hashCode:" + hashCode);

        // isEmpty()
        boolean b3 = map1.isEmpty();
        System.out.println("isEmpty:" + b3);

        // putAll​(Map<? extends K,​? extends V> m)

        map1.putAll(map);
        System.out.println("putAll:" + map1);

        // size()
        int size = map1.size();
        System.out.println("size:" + size);

        //toString()
        String str = map1.toString();
        System.out.println("toString:" + str);

        /* java.util.concurrent.ConcurrentMap - Methods */

        // forEach​(BiConsumer<? super K,​? super V> action)
        map1.forEach((k, v) -> System.out.println("Key:" + k + " Value:" + v));

       // replaceAll​(BiFunction<? super K,​? super V,​? extends V> function)

        map1.replaceAll((k, v) -> v + "1");
        System.out.println("replaceAll:" + map1);

       
        /* java.util.concurrent.ConcurrentNavigableMap - Methods */

        // descendingKeySet()
        NavigableSet<String> set2 = map.descendingKeySet();
        System.out.println("descendingKeySet:" + set2);

        // descendingMap()
        NavigableMap<String, String> map9 = map.descendingMap();
        System.out.println("descendingMap:" + map9);

        //navigableKeySet()
        NavigableSet<String> set3 = map.navigableKeySet();
        System.out.println("navigableKeySet:" + set3);

        /* java.util.Map -- Methods */

        // hashCode()
        int hashCode1 = map.hashCode();
        System.out.println("hashCode:" + hashCode1);

        //putAll​(Map<? extends K,​? extends V> m)

        map1.putAll(map);
        System.out.println("putAll:" + map1);

        // size()

        int size1 = map1.size();

        System.out.println("size:" + size1);

        // java.util.SortedMap -- Methods //
        // comparator()
        Comparator<? super String> comparator = map.comparator();
        ConcurrentSkipListMap<String, String> map10 = new ConcurrentSkipListMap<>(comparator);

        map10.putAll(map);
        System.out.println("comparator:" + map10);

        ConcurrentSkipListMap<String, String> map11 = new ConcurrentSkipListMap<>(Comparator.reverseOrder());

        map11.putAll(map);
        System.out.println("comparator:" + map11);



    }
    
}
