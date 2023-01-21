
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods6 {

    public static void main(String[] args) throws Exception {
        // newKeySet​(int initialCapacity)
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);
        Set<String> keys = ConcurrentHashMap.newKeySet(map.size());
        keys.add("one");
        keys.add("two");
        keys.add("three");
        keys.add("four");
        System.out.println("KeySet:" + keys);
        System.out.println("Map:" + map.size());
    }
    
}
