import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMethods17 {

    public static void main(String[] args) throws Exception {
        //reduceEntriesToDouble​(long parallelismThreshold, ToDoubleFunction<Map.Entry<K,​V>> transformer, double basis, DoubleBinaryOperator reducer)
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);

        double result = map.reduceEntriesToDouble(2, (entry) -> {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
            return Double.parseDouble(entry.getValue());
        }, 0, (a, b) -> {
            System.out.println("Value1:" + a + " Value2:" + b);
            return a + b;
        });
        System.out.println("Result:" + result);
        System.out.println(" ");
        double result2 = map.reduceEntriesToDouble(2, (entry) -> {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
            return Double.parseDouble(entry.getValue());
        }, 1, (a, b) -> {
            System.out.println("Value1:" + a + " Value2:" + b);
            return a + b;
        });
        System.out.println("Result:" + result2);
    }
}


      
