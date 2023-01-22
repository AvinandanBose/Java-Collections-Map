import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods32 {
    //reduceValuesToLong​(long parallelismThreshold, ToLongFunction<? super V> transformer, long basis, LongBinaryOperator reducer)

    public static void main(String[] args) throws Exception {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        System.out.println("Map:" + map);

        long result = map.reduceValuesToLong(2, v -> {
            System.out.println("Value:" + v);
            return Long.parseLong(v);
        }, 1, (v1, v2) -> {
            System.out.println("Value1:" + v1 + " Value2:" + v2);
            return v1 + v2;
        });
        System.out.println("Result:" + result);

    }
}
