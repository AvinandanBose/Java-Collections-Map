import java.util.TreeMap;

public class TreeMapMethods3 {
    public static void main(String[] args) throws Exception {
        //headMap
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println("Map:" + map);
        System.out.println("Head Map:" + map.headMap("b"));
        System.out.println("Head Map:" + map.headMap("b", true));
        System.out.println("Head Map:" + map.headMap("b", false));
      
    }
    
}
