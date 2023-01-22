
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods19 {

    public static void main(String[] args) throws Exception {
//reduceEntriesToLong​(long parallelismThreshold, ToLongFunction<Map.Entry<K,​V>> transformer, long basis, LongBinaryOperator reducer)

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);

        long result = map.reduceEntriesToLong(2, (entry) -> {
            return Long.parseLong(entry.getValue());
        }, 0, (a, b) -> {
            return a + b;
        });
        System.out.println("Result:" + result);

    }
    
}
