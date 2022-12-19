import java.util.HashMap;
public class mapmethods13 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        System.out.println("Map:" + map);
        map.remove("a", 1);
        System.out.println("Map:" + map);
        map.remove("b", 1);
        System.out.println("Map:" + map);//will not remove as the value is not 1

    }
}
