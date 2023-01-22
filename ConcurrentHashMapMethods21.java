import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods21 {
    public static void main(String[] args) throws Exception {
        //reduceKeys​(long parallelismThreshold, Function<? super K,​? extends U> transformer, BiFunction<? super U,​? super U,​? extends U> reducer)
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        System.out.println("Map:" + map);
        
        Integer result = map.reduceKeys(2, k -> {
            System.out.println("Key:" + k);
            return k;
        }, (k1, k2) -> {
            System.out.println("Key1:" + k1 + " Key2:" + k2);
            return k1 + k2;
        });
        System.out.println("Result:" + result);
    }
}

   