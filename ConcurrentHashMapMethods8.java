
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods8 {
    
        public static void main(String[] args) throws Exception {
            // forEachEntry​(long parallelismThreshold, Consumer<? super Map.Entry<K,​V>> action)

            ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
            map.put("one", "1");
            map.put("two", "2");
            map.put("three", "3");
            map.put("four", "4");
            System.out.println("Map:" + map);

            map.forEachEntry(2, (entry) -> {
                System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
            });
    
            map.forEachEntry(2, k-> System.out.println("Key:" + k));

            
        }
    
}
