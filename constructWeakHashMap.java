
import java.util.WeakHashMap;
public class constructWeakHashMap {
    WeakHashMap<String, String> map = new WeakHashMap<>();
    public static void main(String[] args) throws Exception {
        constructWeakHashMap c = new constructWeakHashMap();
        c.map.put("a", "b");
        System.out.println("Map:" + c.map);
        
    } 
    
}
