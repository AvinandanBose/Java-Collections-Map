import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods18 {
    public static void main(String[] args) throws Exception {
        //reduceEntriesToInt​(long parallelismThreshold, ToIntFunction<Map.Entry<K,​V>> transformer, int basis, IntBinaryOperator reducer)

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);

        int result = map.reduceEntriesToInt(2, (entry) -> {
            return Integer.parseInt(entry.getValue());
        }, 0, (a, b) -> {
            return a + b;
        });

        System.out.println("Result:" + result);

        
    }
}


