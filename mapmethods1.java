import java.util.HashMap;


public class mapmethods1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 1);
        map.put("Six", 6);
        System.out.println("Before clear:" + map);
        map.forEach((String key, Integer value) -> {
            System.out.println(key + ":" + value);
        });

        map.clear();

        System.out.println("After clear:" + map);
        
    }

    
}
