import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentSkipListMap;
public class MapEntry_ConcurrentSkipListMap {
    //Map.Entry
    public static void main(String[] args) throws Exception {
        ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>();
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
        System.out.println(" ");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println("Entry Set:" + entries);
        System.out.println(" ");
        for (Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        }
        Set<Entry<String, String>> entries1 = map.entrySet();
        System.out.println("Entry Set:" + entries1);

        // higherEntry​(K key)
        Entry<String, String> entry4 = map.higherEntry("3");
        System.out.println("higherEntry:" + entry4);

        // lowerEntry​(K key)
        Entry<String, String> entry5 = map.lowerEntry("3");
        System.out.println("lowerEntry:" + entry5);
        System.out.println(" ");
        // ceilingEntry​(K key)
        Entry<String, String> entry6 = map.ceilingEntry("3");
        System.out.println("ceilingEntry:" + entry6);

        // floorEntry​(K key)
        Entry<String, String> entry7 = map.floorEntry("3");
        System.out.println("floorEntry:" + entry7);
        System.out.println(" ");

        // firstEntry()
        Entry<String, String> entry8 = map.firstEntry();
        System.out.println("firstEntry:" + entry8);
        System.out.println(" ");

        // lastEntry()
        Entry<String, String> entry9 = map.lastEntry();
        System.out.println("lastEntry:" + entry9);
        System.out.println(" ");

        // pollFirstEntry()
        Entry<String, String> entry10 = map.pollFirstEntry();
        System.out.println("pollFirstEntry:" + entry10);
        System.out.println(" ");

        // pollLastEntry()
        Entry<String, String> entry11 = map.pollLastEntry();
        System.out.println("pollLastEntry:" + entry11);
        System.out.println(" ");




    }
    
}
