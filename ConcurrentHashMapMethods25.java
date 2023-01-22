import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods25 {

    //reduceToDouble​(long parallelismThreshold, ToDoubleBiFunction<? super K,​? super V> transformer, double basis, DoubleBinaryOperator reducer)
    public static void main(String[] args) throws Exception {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        System.out.println("Map:" + map);

        double result = map.reduceToDouble(2, (k, v) -> {
            System.out.println("Key:" + k + " Value:" + v);
            return Double.parseDouble(v);
        }, 2, (v1, v2) -> {
            System.out.println("Value1:" + v1 + " Value2:" + v2);
            return v1 + v2;
        });
        System.out.println("Result:" + result);

    }
}
