import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMethods26 {
    //reduceToInt​(long parallelismThreshold, ToIntBiFunction<? super K,​? super V> transformer, int basis, IntBinaryOperator reducer)
    public static void main(String[] args) throws Exception {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        System.out.println("Map:" + map);

        int result = map.reduceToInt(2, (k, v) -> {
            System.out.println("Key:" + k + " Value:" + v);
            return Integer.parseInt(v);
        }, 0, (v1, v2) -> {
            System.out.println("Value1:" + v1 + " Value2:" + v2);
            return v1 + v2;
        });
        System.out.println("Result:" + result);
    }
}
