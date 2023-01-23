 import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
public class SortedMap9 {

    public static void main(String[] args) throws Exception {
        SortedMap<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        System.out.println("Map:" + map);

        SortedMap<Integer, Integer> map2 = new TreeMap<>(Comparator.comparingInt(o -> o*(-1)));
        map2.put(1, 1);
        map2.put(2, 2);
        map2.put(3, 3);
        map2.put(4, 4);

        System.out.println("Map2:" + map2);

        SortedMap<Integer, Integer> map3 = new TreeMap<>(Comparator.comparingInt(o -> o * (1)));
        map3.put(1, 1);
        map3.put(2, 2);
        map3.put(3, 3);
        map3.put(4, 4);

        System.out.println("Map2:" + map3);
        
    }
    
}
