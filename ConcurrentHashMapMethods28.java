import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods28 {

    //reduceValues​(long parallelismThreshold, BiFunction<? super V,​? super V,​? extends V> reducer)

    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);

        String result = map.reduceValues(2, (v1, v2) -> {
            System.out.println("Value1:" + v1 + " Value2:" + v2);
            return v1 + v2;
        });
        System.out.println("Result:" + result);
    }
    
}
