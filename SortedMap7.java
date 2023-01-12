import java.util.TreeMap;
import java.util.SortedMap;
public class SortedMap7 {
    public static void main(String[] args) throws Exception {
        // subMap
        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        System.out.println("Map:" + map);
        System.out.println("Sub  Map:" + map.subMap("b", "e"));
      

    }
}
