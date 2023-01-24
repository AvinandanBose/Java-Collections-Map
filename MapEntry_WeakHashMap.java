import java.util.WeakHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class MapEntry_WeakHashMap {

public static void main(String[] args) throws Exception {
    Map<String, String> map = new WeakHashMap<>();
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
    for (Map.Entry<String, String> entry : map.entrySet()) {
        System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
    }
    Set<Map.Entry<String, String>> entries = map.entrySet();
    System.out.println("Entry Set:" + entries);

    for (Entry<String, String> entry : map.entrySet()) {
        System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
    }
    Set<Entry<String, String>> entries1 = map.entrySet();
    System.out.println("Entry Set:" + entries1);
}
    
}
