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

     System.out.println(" ");

   }
}

/*
 * +++++++++++++++++++++++++++
 * + Map:{one=1, two=2, three=3, four=4}
 * Note: The parallelismThreshold is 1, so the transformer is applied to each
 * entry in the map.
 * 
 * + Key:one Value:1
 * + Key:two Value:2
 * + Key:three Value:3
 * + Key:four Value:4
 * 
 * Note: The parallelismThreshold is 1, so the reducer is applied to each entry
 * in the map.
 * 
 * + Value1:one1 Value2:two2 (return k + v;)
 * + Value1:three3 Value2:four4 (return k + v;)
 * + Value1:one1two2 Value2:three3four4 ( return v1 + v2;)
 * + Result:one1two2three3four4( return v1 + v2;)
 * 
 * +++++++++++++++++++++++++++
 */

   




