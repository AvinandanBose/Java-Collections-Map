import java.util.HashMap;

public class mapmethods23 {

    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
      

        map.merge("f", 6, (v1, v2) -> v1 + v2);
        System.out.println(map);
        map.merge("g", 7, (v1, v2) ->  v2);
        System.out.println(map);
        map.merge("h", 8,(v1,v2)->v2);
        System.out.println(map);

        map.forEach((key, value) -> map.merge(key, value, (v1, v2) -> v1 + v2));
        System.out.println(map);
       
    }
    
}
