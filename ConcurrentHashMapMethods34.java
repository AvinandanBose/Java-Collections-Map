import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods34 {
    //searchEntries​(long parallelismThreshold, Function<Map.Entry<K,​V>,​? extends U> searchFunction)

    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        System.out.println("Map:" + map);

        String result = map.searchEntries(2, (entry) -> {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
            if (entry.getKey().equals("three")) {
                return entry.getValue();
            }
            return null;
        });
        System.out.println("Result:" + result);
    }
    
}
