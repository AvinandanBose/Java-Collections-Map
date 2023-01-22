import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMethods14 {
   public static void main(String[] args) throws Exception {
    // reduce​(long parallelismThreshold, BiFunction<? super K,​? super V,​? extends U> transformer, BiFunction<? super U,​? super U,​? extends U> reducer)

    ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
    map.put("one", "1");
    map.put("two", "2");
    map.put("three", "3");
    map.put("four", "4");
    System.out.println("Map:" + map);

    String result = map.reduce(1, (k, v) -> {
        System.out.println("Key:" + k + " Value:" + v);
        return k + v;
    }, (v1, v2) -> {
        System.out.println("Value1:" + v1 + " Value2:" + v2);
        return v1 + v2;
    });
    System.out.println("Result:" + result);
   }
}
   
