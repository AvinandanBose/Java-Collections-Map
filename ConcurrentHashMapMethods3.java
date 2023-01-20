import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMethods3 {

    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        
        Set<String> set = map.keySet("1");
        set.add("one");
        set = map.keySet("2");
        set.add("two");
        set = map.keySet("3");
        set.add("three");
        set = map.keySet("4");
        set.add("four");
        System.out.println("Set:" + set);
        System.out.println("Map:" + map);

        ConcurrentHashMap<String, String> map2 = new ConcurrentHashMap<>();
        map2.put("one", "1");
        map2.put("two", "2");
        map2.put("three", "3");
        map2.put("four", "4");
        
        Set<String> set2 = map2.keySet();
        System.out.println("Set2:" + set2);


        

        
    }
    
}
