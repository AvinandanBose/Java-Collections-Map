import java.util.NavigableMap;
import java.util.TreeMap;
public class NavigableMap7 {
    // floorKey
    public static void main(String[] args) throws Exception {
        NavigableMap<Float, Integer> map = new TreeMap<>();
        map.put(1.8f,11 );
        map.put(2.6f, 9);
        map.put(3.4f, 78);
        map.put(4.3f, 5);
        map.put(5.6f, 1);
        map.put(6.8f, 3);
        System.out.println("Map:" + map);
        System.out.println("Floor Key:" + map.floorKey(3.0f)); // less than 3.4f and greater than 2.6f,hence returns 2.6f (floor Value)
        System.out.println("Floor Key:" + map.floorKey(1.0f)); //less than 1.8fi.e(First Entry) ,hence no floor value , returns null.
        System.out.println("Floor Key:" + map.floorKey(1.9f)); //less than 2.6f and greater than 1.8f,hence returns 1.8f (floor Value)
        System.out.println("Floor Key:" + map.floorKey(3.4f)); //equal to 3.4f ,hence returns 3.4f (If equal , it becomes Floor Value of itself)
        System.out.println("Floor Key:" + map.floorKey(3.5f)); //less than 4.3f and greater than 3.4f,hence returns 3.4f (floor Value)
        System.out.println("Floor Key:" + map.floorKey(6.5f)); //less than 6.8f and greater than 5.6f,hence returns 5.6f (floor Value)
        System.out.println("Floor Key:" + map.floorKey(6.8f)); //equal to 6.8f ,hence returns 6.8f (If equal , it becomes Floor Value of itself)
        System.out.println("Floor Key:" + map.floorKey(7.0f)); //greater than 6.8f , returns 6.8f(Floor Value).
        
    }
    
}
