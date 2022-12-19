import java.util.HashMap;
public class mapmethods17 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        System.out.println("Map:" + map);
        System.out.println(" ");
        map.values().forEach(System.out::println);
        System.out.println(" ");
        map.values().forEach((v) -> System.out.println(v));
        System.out.println(" ");
        System.out.println("Values :" + map.values());
        // remove
        map.values().remove(2);
        System.out.println(" ");
        System.out.println("Map:" + map);
        System.out.println("Map:" + map.values());
        System.out.println(" ");
        // removeAll
        map.values().removeAll(map.values());
        System.out.println(map.values());
        System.out.println(" ");

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);

        
        // removeIf
        map.values().removeIf((v) -> v % 2 == 0);
        System.out.println(" ");
        System.out.println("Map:" + map);
        System.out.println(" ");
        //retainAll
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 3);
        map1.put("b", 4);
        map1.put("c", 5);
        map1.put("d", 2);
        System.out.println("Map1: " + map1);
        System.out.println("Map1: "+ map1.values());
       map.values().retainAll(map1.values());
        System.out.println(" ");
        System.out.println("Map:" + map);
        System.out.println(" ");
      
       System.out.println(map.values());

       //Clear
       map.values().clear();

        System.out.println("Map:"+ map);

    }
}
