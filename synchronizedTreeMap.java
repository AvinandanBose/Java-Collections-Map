
import java.util.Collections;
import java.util.TreeMap;
import java.util.SortedMap;

public class synchronizedTreeMap {
    public static void main(String[] args) throws Exception {
        // synchronizedTreeMap
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println("Map:" + map);
        SortedMap<String,Integer> sortedMap = Collections.synchronizedSortedMap(map);
        
        System.out.println("Synchronized Map:" + sortedMap);
    }
    
}
