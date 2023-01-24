import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
public class MapEntry_ConcurrentHashMap {
    //Map.Entry
    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
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

        




    }
    
}
