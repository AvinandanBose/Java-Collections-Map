import java.util.NavigableMap;
import java.util.TreeMap;
public class NavigableMap8 {
    //headMap(K toKey, boolean inclusive)
    public static void main(String[] args) throws Exception {
        NavigableMap<Float, Integer> map = new TreeMap<>();
        map.put(1.8f,11 );
        map.put(2.6f, 9);
        map.put(3.4f, 78);
        map.put(4.3f, 5);
        map.put(5.6f, 1);
        map.put(6.8f, 3);
        System.out.println("Map:" + map);
        System.out.println("headMap:" + map.headMap(3.4f, true));
        // Returns a view of the portion of this map whose keys are equal to toKey,if inclusive is true.
        System.out.println("headMap:" + map.headMap(3.4f, false));
        // Returns a view of the portion of this map whose keys are less than toKey,if inclusive is false.
        
    }
    
}
