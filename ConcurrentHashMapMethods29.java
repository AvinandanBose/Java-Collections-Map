import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods29 {

    //reduceValues​(long parallelismThreshold, Function<? super V,​? extends U> transformer, BiFunction<? super U,​? super U,​? extends U> reducer)

    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);

        String result = map.reduceValues(2, v -> {
            System.out.println("Value:" + v);
            return v;
        }, (v1, v2) -> {
            System.out.println("Value1:" + v1 + " Value2:" + v2);
            return v1 + v2;
        });
        System.out.println("Result:" + result);
    }
}
