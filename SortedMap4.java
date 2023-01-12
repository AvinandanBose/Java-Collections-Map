import java.util.TreeMap;
import java.util.SortedMap;
public class SortedMap4 {
    public static void main(String[] args) throws Exception {
        // lastKey
        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println("Map:" + map);
        System.out.println("Last Key:" + map.lastKey());
    }
}
