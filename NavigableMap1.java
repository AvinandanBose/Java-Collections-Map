import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap1 {
    //ceilingEntry
    public static void main(String[] args) throws Exception {
        NavigableMap<Float, Integer> map = new TreeMap<>();
        map.put(1.8f,11 );
        map.put(2.6f, 9);
        map.put(3.4f, 78);
        map.put(4.3f, 5);
        map.put(5.6f, 1);
        map.put(6.8f, 3);
        System.out.println("Map:" + map);
        System.out.println("Ceiling Entry:" + map.ceilingEntry(1.5f));// less than 1.8 but it returns 1.8
        System.out.println("Ceiling Entry:" + map.ceilingEntry(1.9f));// less than 2.6f and greater than 1.8f but it returns 2.6
        System.out.println("Ceiling Entry:" + map.ceilingEntry(4.3f)); // Equal to 4.3f           
        System.out.println("Ceiling Entry:" + map.ceilingEntry(3.4f)); // Equal to 3.4f         
        System.out.println("Ceiling Entry:" + map.ceilingEntry(6.5f));// less than 6.8 but it returns 6.8
        System.out.println("Ceiling Entry:" + map.ceilingEntry(5.6f)); // Equal to 5.6f
    }
    
}
