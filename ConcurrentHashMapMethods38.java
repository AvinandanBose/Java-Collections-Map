import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods38 {
    // Enumeration<K> keys()

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        System.out.println("Map:" + map);

        map.keys().asIterator().forEachRemaining(System.out::println);

        Enumeration<String> enums = map.keys();
        while (enums.hasMoreElements()) {
            System.out.println(enums.nextElement());
        }

        System.out.println("Map:" + map);

    }
    
}
