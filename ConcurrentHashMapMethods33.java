import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMethods33 {

    //search​(long parallelismThreshold, BiFunction<? super K,​? super V,​? extends U> searchFunction)
    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);

        String result = map.search(2, (k, v) -> {
            System.out.println("Key:" + k + " Value:" + v);
            if (k.equals("three")) {
                return v;
            }
            return null;
        });
        System.out.println("Result:" + result);
    }
    
}
