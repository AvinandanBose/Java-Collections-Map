
import java.util.HashMap;
public class mapmethods11 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        System.out.println("Map:" + map);
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.putAll(map);
        System.out.println("Map1:" + map1);
    }
}
