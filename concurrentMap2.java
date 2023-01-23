import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.Map;

public class concurrentMap2 {
    public static void main(String[] args) {
        

        //of()
        Map<String, String> map2 = Map.of();
        ConcurrentMap<String, String> map = new ConcurrentHashMap<>(map2);
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");                      
        map.put("4", "four");
        System.out.println("Map:" + map);

     

    }
}
