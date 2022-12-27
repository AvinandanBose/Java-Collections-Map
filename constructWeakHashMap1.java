import java.util.WeakHashMap;
public class constructWeakHashMap1 {
    public static void main(String[] args) throws Exception {
        WeakHashMap<String, String> map = new WeakHashMap<>(16);
        map.put("a", "b");
        System.out.println("Map:" + map);
    }
    
}
