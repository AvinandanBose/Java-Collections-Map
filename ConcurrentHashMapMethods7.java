import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods7 {

    public static void main(String[] args) throws Exception {
        // forEach​(long parallelismThreshold, BiConsumer<? super K,​? super V> action)
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);

           
       map.forEach(2, (String k, String v) -> {
            System.out.println("Key:" + k + " Value:" + v);
         
        });

    }

}
