import java.util.SortedMap;
import java.util.TreeMap;
public class SortedMap8 {
    public static void main(String[] args) throws Exception {
        // headMap
        SortedMap<String, Integer> map = new TreeMap<>((a,b) -> b.compareTo(a));
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);

        System.out.println("Map:" + map);
        
    }
    
}
