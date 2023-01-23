import java.util.concurrent.ConcurrentSkipListMap;
import java.util.SortedMap;
import java.util.TreeMap;
public class constructConcurrentSkipListMap4 {
    public static void main(String[] args) {
        // ConcurrentSkipListMap​(SortedMap<K,​V> m)
        SortedMap<String, String> map2 = new TreeMap<>();
        ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>(map2);
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        System.out.println("Map:"+map);
    }
    
}
