import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods9 {
    public static void main(String[] args) throws Exception {
        // forEachEntry​(long parallelismThreshold, Function<Map.Entry<K,​V>,​? extends U> transformer, Consumer<? super U> action)
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);
        map.forEachEntry(2, (entry) -> {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
            return entry.getValue();
        }, v -> System.out.println("Value:" + v));
    }
    
}
