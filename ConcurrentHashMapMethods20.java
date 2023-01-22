import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMethods20 {

    public static void main(String[] args) throws Exception {
        //reduceKeys​(long parallelismThreshold, BiFunction<? super K,​? super K,​? extends K> reducer)

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);

        String result = map.reduceKeys(2, (k1, k2) -> {
            System.out.println("Key1:" + k1 + " Key2:" + k2);
            return k1 + k2;
        });
        System.out.println("Result:" + result);
    }
}
  
