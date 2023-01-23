import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.Map;
public class concurrentMap4 {
    public static void main(String[] args) {

        //ofEntries(Map.Entry)
        Map <String, String> e1 = Map.ofEntries(Map.entry("1", "one"), Map.entry("2", "two"), Map.entry("3", "three"), Map.entry("4", "four"));

        ConcurrentMap<String, String> map = new ConcurrentHashMap<>(e1);
        map.put("5", "five");
        map.put("6", "six");
        map.put("7", "seven");
        map.put("8", "eight");
        System.out.println("Map:" + map);
        


    }
}
