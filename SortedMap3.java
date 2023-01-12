import java.util.TreeMap;
import java.util.SortedMap;
public class SortedMap3 {

    public static void main(String[] args) throws Exception{
        //firstKey
        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println("Map:" + map);
        System.out.println("First Key:" + map.firstKey());
    }

    
}
