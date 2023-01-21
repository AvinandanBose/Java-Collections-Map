import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods10 {
    public static void main(String[] args) throws Exception {
        // forEachKey​(long parallelismThreshold, Consumer<? super K> action)
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);
        map.forEachKey(2, k-> System.out.println("Key:" + k));

    }
}
    
