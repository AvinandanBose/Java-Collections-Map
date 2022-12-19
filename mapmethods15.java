import java.util.HashMap;

public class mapmethods15 {
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
        map1.put("g", 7);
        map1.put("h", 8);
        map1.put("i", 9);
        map1.put("j", 10);
        map1.putAll(map);
        System.out.println("Map1:" + map1);
        map1.replaceAll((k, v) -> v*2 );
        System.out.println("Map1:" + map1);
         map1.replaceAll((k, v) -> v/2 );
         System.out.println("Map1:" + map1);
         map1.replaceAll((k, v) -> v%2==1 ? v*2 : v/2 );
         System.out.println("Map1:" + map1);
    

    }
}
