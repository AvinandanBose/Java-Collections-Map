import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMethods16 {

    public static void main(String[] args) throws Exception {
       //reduceEntries​(long parallelismThreshold, Function<Map.Entry<K,​V>,​? extends U> transformer, BiFunction<? super U,​? super U,​? extends U> reducer)
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);

        String result = map.reduceEntries(2, (entry) -> {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
            return entry.getKey() + entry.getValue();
        }, (v1, v2) -> {
            System.out.println("Value1:" + v1 + " Value2:" + v2);
            return v1 + v2;
        });
        System.out.println("Result:" + result);
    }
}
       

 