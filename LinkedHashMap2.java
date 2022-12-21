import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMap2 {
    public static void main(String[] args) throws Exception {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(){
            @Override
            protected boolean removeEldestEntry(Map.Entry< String,Integer> eldest)
            {
                return size() > 3;
            }
    };
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        map.put("g", 7);
        map.put("h", 8);
        map.put("i", 9);
        map.put("j", 10);
        System.out.println(map);
}
}
