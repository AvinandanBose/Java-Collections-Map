import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods12 {
    public static void main(String[] args) throws Exception {
        // forEachKey​(long parallelismThreshold, Consumer<? super V> action)
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);
        map.forEachValue(2, v-> System.out.println("Value:" + v));

    }
    
}
