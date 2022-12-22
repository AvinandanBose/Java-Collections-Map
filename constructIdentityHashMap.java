
import java.util.IdentityHashMap;
public class constructIdentityHashMap {
    public static void main(String[] args) throws Exception {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        System.out.println(map);
        
    }
}
