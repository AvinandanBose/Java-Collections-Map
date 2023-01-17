
import java.util.Collections;
import java.util.TreeMap;
import java.util.SortedMap;

public class synchronizedTreeMap {
    public static void main(String[] args) throws Exception {
        Thread th = new Thread();
        // synchronizedTreeMap
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println("Map:" + map);
        SortedMap<String,Integer> sortedMap = Collections.synchronizedSortedMap(map);
        
        System.out.println("Synchronized Map:" + sortedMap);
        th.start();
        Thread.sleep(1000);

        TreeMap<String, Integer> map1 = new TreeMap<>();
        TreeMap<String, Integer> map2 = new TreeMap<>();
        //synchronized () -- method
        synchronized (map1) {
            map1.put("a", 1);
            map1.put("b", 2);
            map1.put("c", 3);                               
            System.out.println("Map1:" + map1);
        }
        synchronized (map2) {
            map2.put("a", 1);
            map2.put("b", 2);
            map2.put("c", 3);                               
            System.out.println("Map2:" + map2);
        }
        th.stop();
    }
    
}
