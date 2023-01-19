
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentNavigableMap;

public class concurrentNavigableMap1 {

  public static void main(String[] args) {

    ConcurrentNavigableMap<String, String> map = new ConcurrentSkipListMap<>();
    

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

   System.out.println("Map:" + map);
   
   // descendingKeySet
   Set<String> set = map.descendingKeySet();
    System.out.println("Descending Key Set: " + set);

    // descendingMap

    ConcurrentNavigableMap<String, String> map1 = map.descendingMap();
    System.out.println("Descending Map: " + map1);
    Map<String, String> map2 =  map.descendingMap();
    System.out.println("Descending Map: " + map2);


    //headMap​(toKey:Key)
    Map<String, String> map3 = map.headMap("5");
    System.out.println("Head Map: " + map3);

    //headMap​(toKey:Key, inclusive:boolean)
    Map<String, String> map4 = map.headMap("5", true);
    System.out.println("Head Map: " + map4);
    Map<String, String> map8 = map.headMap("5", false);
    System.out.println("Head Map: " + map8);

    //tailMap​(fromKey:Key)
    Map<String, String> map5 = map.tailMap("5");
    System.out.println("Tail Map: " + map5);

    //tailMap​(fromKey:Key, inclusive:boolean)
    Map<String, String> map6 = map.tailMap("5", true);
    System.out.println("Tail Map: " + map6);
    Map<String, String> map7 = map.tailMap("5", false);
    System.out.println("Tail Map: " + map7);

    //subMap​(fromKey:Key, toKey:Key)
    Map<String, String> map9 = map.subMap("5", "8");
    System.out.println("Sub Map: " + map9);

    //subMap​(fromKey:Key, fromInclusive:boolean, toKey:Key, toInclusive:boolean)

    Map<String, String> map10 = map.subMap("5", true, "8", true);
    System.out.println("Sub Map: " + map10);
    Map<String, String> map11 = map.subMap("5", false, "8", true);
    System.out.println("Sub Map: " + map11);
    Map<String, String> map12 = map.subMap("5", true, "8", false);
    System.out.println("Sub Map: " + map12);

    //pollFirstEntry
    System.out.println("Map: " + map);
    Map.Entry<String, String> entry = map.pollFirstEntry();
    System.out.println("Map: " + entry);
    System.out.println("Map: " + map);

    // pollLastEntry
    Entry<String, String> entry1 = map.pollFirstEntry();
    System.out.println("Map: " + entry1);
    System.out.println("Map: " + map);

    // lowerEntry
    Entry<String, String> entry2 = map.lowerEntry("5");
    System.out.println("Map: " + entry2);
    System.out.println("Map: " + map);
       
    // floorEntry
    Entry<String, String> entry3 = map.floorEntry("5");
    System.out.println("Map: " + entry3);
    System.out.println("Map: " + map);

    // ceilingEntry
    Entry<String, String> entry4 = map.ceilingEntry("5");
    System.out.println("Map: " + entry4);

    // higherEntry
    Entry<String, String> entry5 = map.higherEntry("5");
    System.out.println("Map: " + entry5);

    // firstEntry
    Entry<String, String> entry6 = map.firstEntry();
    System.out.println("Map: " + entry6);
    System.out.println("Map: " + map);
       
    // lastEntry
    Entry<String, String> entry7 = map.lastEntry();
    System.out.println("Map: " + entry7);
    System.out.println("Map: " + map);

    // lowerKey
    String key = map.lowerKey("5");
    System.out.println("Map: " + key);
    System.out.println("Map: " + map);

    // floorKey
    String key1 = map.floorKey("5");
    System.out.println("Map: " + key1);
    System.out.println("Map: " + map);

    // ceilingKey
    String key2 = map.ceilingKey("5");
    System.out.println("Map: " + key2);

    // higherKey
    String key3 = map.higherKey("5");
    System.out.println("Map: " + key3);
       
    // firstKey
    String key4 = map.firstKey();
    System.out.println("Map: " + key4);
    System.out.println("Map: " + map);

    // lastKey

    String key5 = map.lastKey();
    System.out.println("Map: " + key5);
    System.out.println("Map: " + map);

    // pollFirstEntry
    System.out.println("Map: " + map);
    Map.Entry<String, String> entry8 = map.pollFirstEntry();
    System.out.println("Map: " + entry8);
    System.out.println("Map: " + map);
    
    // pollLastEntry
    Entry<String, String> entry9 = map.pollLastEntry();
    System.out.println("Map: " + entry9);
    System.out.println("Map: " + map);
       
    // remove(key:Key)
    map.remove("5");
    System.out.println("Map: " + map);

    // remove(key:Key, value:Value)
    map.remove("4", "four");
    System.out.println("Map: " + map);

    // replace(key:Key, value:Value)
    map.replace("3", "three");
    System.out.println("Map: " + map);

    // replace(key:Key, oldValue:Value, newValue:Value)

    map.replace("2", "two", "two");
    System.out.println("Map: " + map);

    // replaceAll(function:BiFunction)
    map.replaceAll((k, v) -> v.toUpperCase());
    System.out.println("Map: " + map);

    // compute(key:Key, remappingFunction:BiFunction)
    map.compute("1", (k, v) -> v.toUpperCase());
    System.out.println("Map: " + map);

    // computeIfAbsent(key:Key, mappingFunction:Function)
    map.computeIfAbsent("1", k -> "one");
    System.out.println("Map: " + map);

    // computeIfPresent(key:Key, remappingFunction:BiFunction)
    map.computeIfPresent("1", (k, v) -> v.toUpperCase());
    System.out.println("Map: " + map);

    // merge(key:Key, value:Value, remappingFunction:BiFunction)
    map.merge("1", "one", (v1, v2) -> v1.toUpperCase());
    System.out.println("Map: " + map);



    //....... etc ....... of all the methods of SortedMap interface,Map Interface, 
    //And NavigableMap Interface,  ConcurrentMap Interface,




  }

    
}
