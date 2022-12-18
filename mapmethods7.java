import java.util.HashMap;

public class mapmethods7 {

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
        int val = map.getOrDefault("Six", 6);
        System.out.println("Value :" + val);
        
        int val1=  map.getOrDefault("Six", 7);
        System.out.println("Value :" + val1);

        System.out.println(map.getOrDefault("Seven", 6));

    }
    
}
