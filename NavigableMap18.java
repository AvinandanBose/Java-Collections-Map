import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap18 {
    public static void main(String[] args) throws Exception {
        // tailMap(fromKey :Key, boolean inclusive: true/false);
        NavigableMap<Float, Integer> map = new TreeMap<>();
        map.put(1.8f,11 );
        map.put(2.6f, 9);
        map.put(3.4f, 78);
        map.put(4.3f, 5);
        map.put(5.6f, 1);
        map.put(6.8f, 3);
        System.out.println("Map:" + map);
        System.out.println("Tail Map:" + map.tailMap(3.4f, true));
        System.out.println("Tail Map:" + map.tailMap(3.4f, false));

    }
    
}
