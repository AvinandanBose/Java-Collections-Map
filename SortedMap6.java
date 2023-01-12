import java.util.TreeMap;
import java.util.SortedMap;
public class SortedMap6 {
    public static void main(String[] args) throws Exception {
        // tailMap
        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        System.out.println("Map:" + map);
        System.out.println("Head Map:" + map.tailMap("e"));

    }
}
