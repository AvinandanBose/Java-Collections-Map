
import java.util.WeakHashMap;
public class constructWeakHashMap2 {
    public static void main(String[] args) throws Exception {
        WeakHashMap<String, String> map = new WeakHashMap<>(16,0.75f);
        map.put("a", "b");
        System.out.println("Map:" + map);
    }
    
} 
    
