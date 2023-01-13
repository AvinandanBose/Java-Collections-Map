import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap2 {

    //ceilingKey
    public static void main(String[] args) throws Exception {
        NavigableMap<Float, Integer> map = new TreeMap<>();
        map.put(1.8f,11 );
        map.put(2.6f, 9);
        map.put(3.4f, 78);
        map.put(4.3f, 5);
        map.put(5.6f, 1);
        map.put(6.8f, 3);
        System.out.println("Map:" + map);
        System.out.println("Ceiling Key:" + map.ceilingKey(1.5f));// less than 1.8 but it returns 1.8(Ceiling Value).
        System.out.println("Ceiling Key:" + map.ceilingKey(1.9f));// less than 2.6f and greater than 1.8f but it returns 2.6f(Ceiling Value)
        System.out.println("Ceiling Key:" + map.ceilingKey(4.3f)); // Equal to 4.3f , hence returns 4.3f  (If equal , it becomes Ceiling Value of itself)        
        System.out.println("Ceiling Key:" + map.ceilingKey(3.4f)); // Equal to 3.4f , hence returns 3.4f (If equal , it becomes Ceiling Value of itself)       
        System.out.println("Ceiling Key:" + map.ceilingKey(6.5f));// less than 6.8 but greater than 5.6f , hence it returns 6.8f(Ceiling Value) .
        System.out.println("Ceiling Key:" + map.ceilingKey(5.6f)); // Equal to 5.6f, hence returns 3.4f (If equal , it becomes Ceiling Value of itself)
    }
    
}
