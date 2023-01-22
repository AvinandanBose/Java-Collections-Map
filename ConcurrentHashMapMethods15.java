import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMethods15 {
    public static void main(String[] args) throws Exception {
        //reduceEntries​(long parallelismThreshold, BiFunction<Map.Entry<K,​V>,​Map.Entry<K,​V>,​? extends Map.Entry<K,​V>> reducer)

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");

        System.out.println("Map:" + map);

        System.out.println(" ");

       map.reduceEntries(2, (entry1, entry2) -> {
            System.out.println("Entry1:" + entry1 + " Entry2:" + entry2);
            return entry1;
        });

        System.out.println(" ");

        String  result = map.reduceEntries(2, (entry1, entry2) -> {
            System.out.println("Entry1:" + entry1 + " Entry2:" + entry2);
            return entry1;
        }).toString();

        System.out.println("Result:" + result);//Result hold the sendcond last entry
    }
}
