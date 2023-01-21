import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods13 {
    public static void main(String[] args) throws Exception {
        // forEachValue​(long parallelismThreshold, Function<? super V,​? extends U>transformer, Consumer<? super U> action)
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);
        map.forEachValue(2, v -> {
            System.out.println("Value:" + v);
            return v;
        }, v -> System.out.println("Value:" + v));

    }
    
}
