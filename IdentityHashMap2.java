import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
public class IdentityHashMap2 {
    public static void main(String[] args) throws Exception {
      Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put(new String("a"), 1);
        
        System.out.println("Map:" + map);
        Boolean b = map.put("a", 1).equals(map.put(new String("a"), 1));
        System.out.println("b:" + b);
        System.out.println("Map:" + map);
        System.out.println("Size of Map:" + map.size());
        Map<String, Integer> map1 = new IdentityHashMap<>();
        map1.put("a", 1);
        map1.put(new String("a"), 1);
        Boolean c = map1.put("a", 1).equals(map1.put(new String("a"), 1));
        System.out.println("c:" + c);
        System.out.println("Map1:" + map1);
        
        map1.put(new String("a"), 2);
        System.out.println("Map1:" + map1);
        map1.put("a", 2);
        System.out.println("Map1:" + map1);
        System.out.println("Size of Map1:" + map1.size());
        
    }
    
}
