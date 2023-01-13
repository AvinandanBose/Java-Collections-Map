import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap6 {
    //floorEntry
    public static void main(String[] args) throws Exception {
        NavigableMap<Float, Integer> map = new TreeMap<>();
        map.put(1.8f,11 );
        map.put(2.6f, 9);
        map.put(3.4f, 78);
        map.put(4.3f, 5);
        map.put(5.6f, 1);
        map.put(6.8f, 3);
        System.out.println("Map:" + map);
        System.out.println("Floor Entry:" + map.floorEntry(3.0f));//3.0f is less than 3.4f and greater than 2.6f,hence returns 2.6f key-value pair(Floor Value).
        System.out.println("Floor Entry:" + map.floorEntry(3.4f));//3.4f is equal to 3.4f ,hence returns 3.4f key-value pair(If equal , it becomes Floor Value of itself).
        System.out.println("Floor Entry:" + map.floorEntry(3.5f));//3.5f is greater than 3.4f and less than 4.3f,hence returns 3.4f key-value pair(Floor Value).
        
    }
    
}
