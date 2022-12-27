import java.util.WeakHashMap;
public class constructWeakHashMap3 {
    public static void main(String[] args) throws Exception {
        WeakHashMap<String, String> map1 = new WeakHashMap<>();
        WeakHashMap<String, String> map = new WeakHashMap<>(map1);
        map.put("a", "b");
        System.out.println("Map:" + map);
    }
    
}
