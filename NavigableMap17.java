import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap17 {
    //SubMap( fromKey:Key, boolean fromInclusive:true/false, toKey:Key, boolean toInclusive:true/false)
    public static void main(String[] args) throws Exception {
        NavigableMap<Float, Integer> map = new TreeMap<>();
        map.put(1.8f,11 );
        map.put(2.6f, 9);
        map.put(3.4f, 78);
        map.put(4.3f, 5);
        map.put(5.6f, 1);
        map.put(6.8f, 3);
        System.out.println("Map:" + map);
        System.out.println("SubMap:" + map.subMap(3.4f, true, 5.6f, true));
        // Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, inclusive.
        System.out.println("SubMap:" + map.subMap(3.4f, false, 5.6f, false));
        // Returns a view of the portion of this map whose keys range from fromKey, exclusive, to toKey, exclusive.
        System.out.println("SubMap:" + map.subMap(3.4f, true, 5.6f, false));
        // Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive.
        System.out.println("SubMap:" + map.subMap(3.4f, false, 5.6f, true));
        // Returns a view of the portion of this map whose keys range from fromKey, exclusive, to toKey, inclusive.
    }
}
