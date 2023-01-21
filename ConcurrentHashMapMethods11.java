import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMethods11 {
    public static void main(String[] args) throws Exception {
        // forEachKey​(long parallelismThreshold, Function<? super K,​? extends U> transformer, Consumer<? super U> action)
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);

        map.forEachKey(2, k -> {
            System.out.println("Key:" + k);
            return k;
        }, k -> System.out.println("Key:" + k));
    }
}
