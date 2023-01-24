import java.util.Map;
public class MapOfEntries {
    //Map.OfEntries
    public static void main(String[] args) throws Exception {
        Map<String, Integer> map = Map.ofEntries(Map.entry("a", 1), Map.entry("b", 2), Map.entry("c", 3));
        System.out.println("Map:" + map);
    }
    
}
