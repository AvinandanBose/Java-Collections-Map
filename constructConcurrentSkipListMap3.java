import java.util.concurrent.ConcurrentSkipListMap;
import java.util.HashMap;
import java.util.Map;
public class constructConcurrentSkipListMap3 {
    public static void main(String[] args) {
        // ConcurrentSkipListMap​(Map<? extends K,​? extends V> m)
        Map<String, String> map2 = new HashMap<>();
        ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>(map2);
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        System.out.println("Map:"+map);
    }
}
