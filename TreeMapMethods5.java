import java.util.TreeMap;
public class TreeMapMethods5 {
    public static void main(String[] args) throws Exception {
        //tailMap
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println("Map:" + map);
        System.out.println("Tail Map:" + map.tailMap("b"));
        System.out.println("Tail Map:" + map.tailMap("b", true));
        System.out.println("Tail Map:" + map.tailMap("b", false));
    }
}
