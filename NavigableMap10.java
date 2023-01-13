import java.util.NavigableMap;
import java.util.TreeMap;
public class NavigableMap10 {
    //higherKey
    public static void main(String[] args) throws Exception {
        NavigableMap<Float, Integer> map = new TreeMap<>();
        map.put(1.8f,11 );
        map.put(2.6f, 9);
        map.put(3.4f, 78);
        map.put(4.3f, 5);
        map.put(5.6f, 1);
        map.put(6.8f, 3);
        System.out.println("Map:" + map);
        System.out.println("higherEntry:" + map.higherKey(3.3f));
        // i.e. if less than 3.4f then it returns 3.4f (Higher Key)
        System.out.println("higherEntry:" + map.higherKey(3.4f));
        // i.e. if equal to 3.4f then it returns 4.3f (Higher Key)
        System.out.println("higherEntry:" + map.higherKey(6.8f));
        // i.e. if greater than 6.8f then it returns null -- No Higher Key
        
    }
    
}
