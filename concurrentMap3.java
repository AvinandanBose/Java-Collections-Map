import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.Map;
public class concurrentMap3 {
    public static void main(String[] args) {

        //of(K,V)
        Map<String, String> map2 = Map.of("1", "one", "2", "two", "3", "three", "4", "four");
        ConcurrentMap<String, String> map = new ConcurrentHashMap<>(map2);
        map.put("5", "five");
        map.put("6", "six");
        map.put("7", "seven");
        map.put("8", "eight");
        System.out.println("Map:" + map);
        
    }
}
