
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
public class constructConcurrentHashMap4 {
    public static void main(String[] args) throws Exception {

        //HashMap
        Map<String, String> map = new HashMap<>();
        ConcurrentHashMap<String, String> map1 = new ConcurrentHashMap<>(map);

        //TreeMap
        Map<String, String> map2 = new TreeMap<>();
        ConcurrentHashMap<String, String> map3 = new ConcurrentHashMap<>(map2);

        //LinkedHashMap
        Map<String, String> map4 = new LinkedHashMap<>();
        ConcurrentHashMap<String, String> map5 = new ConcurrentHashMap<>(map4);

        //WeakHashMap
        Map<String, String> map6 = new WeakHashMap<>();
        ConcurrentHashMap<String, String> map7 = new ConcurrentHashMap<>(map6);

        //IdentityHashMap
        Map<String, String> map8 = new IdentityHashMap<>();
        ConcurrentHashMap<String, String> map9 = new ConcurrentHashMap<>(map8);

       


        map1.put("1", "one");
        map1.put("2", "two");
        map1.put("3", "three");
        map1.put("4", "four");
        map1.put("5", "five");
        map1.put("6", "six");
        map1.put("7", "seven");
        map1.put("8", "eight");

        System.out.println("Map:" + map1);
    }
    
}
