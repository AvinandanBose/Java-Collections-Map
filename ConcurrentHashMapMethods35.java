
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods35 {

    //searchKeys​(long parallelismThreshold, Function<? super K,​? extends U> searchFunction)

    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        System.out.println("Map:" + map);

        Integer result = map.searchKeys(2, k -> {
            System.out.println("Key:" + k);
            if (k == 3) {
                return k;
            }
            return null;
        });
        System.out.println("Result:" + result);
    }
    
}
