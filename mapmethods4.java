
import java.util.HashMap;
public class mapmethods4 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("Six", 6);
        System.out.println("Before clear:" + map);
        map.forEach((String key, Integer value) -> {
            System.out.println(key + ":" + value);
        });

        Boolean v = map.containsValue(5);
        System.out.println("Is 5 present in the map? " + v);

    }
}
