
import java.util.HashMap;

public class mapmethods9 {
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

         System.out.println(map.keySet());

         //keySet().forEach()
         map.keySet().forEach((String key) -> {
             System.out.println(key);
         });

         // keySet().size()
         System.out.println(map.keySet().size());

         // keySet().toArray()
            Object[] arr = map.keySet().toArray();
            for (Object obj : arr) {
                System.out.println(obj);
            }

            // keySet().removeIf()
            map.keySet().removeIf((String key) -> {
                return key.equals("One");
            });
            System.out.println("After removeIf:" + map);

            // keySet().remove()
            map.keySet().remove("Two");
            System.out.println("After remove:" + map);

            // keySet().retainAll()
            map.keySet().retainAll(map.keySet());
            System.out.println("After retainAll:" + map);

            // keySet().removeAll()
            map.keySet().removeAll(map.keySet());

            System.out.println("After removeAll:" + map);




    }
    
}
