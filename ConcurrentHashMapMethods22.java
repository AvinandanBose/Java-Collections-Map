import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods22 {
    public static void main(String[] args) throws Exception {
        //reduceKeysToDouble​(long parallelismThreshold, ToDoubleFunction<? super K> transformer, double basis, DoubleBinaryOperator reducer)
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        System.out.println("Map:" + map);

        double result = map.reduceKeysToDouble(2, k -> {
            System.out.println("Key:" + k);
            return k;
        }, 0, (k1, k2) -> {
            System.out.println("Key1:" + k1 + " Key2:" + k2);
            return k1 + k2;
        });
        System.out.println("Result:" + result);
    }
}
