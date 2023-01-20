
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
public class constructConcurrentHashMap4 {
    public static void main(String[] args) throws Exception {

        // ConcurrentHashMap
        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, String> map1 = new ConcurrentHashMap<>(map);

        /* Similarly.... */

        ConcurrentHashMap<String, String> map11 = new ConcurrentHashMap<>(); 
        ConcurrentHashMap<String, String> map12 = new ConcurrentHashMap<>(map11);

        //HashMap
        Map<String, String> map0 = new HashMap<>();
        ConcurrentHashMap<String, String> map_new = new ConcurrentHashMap<>(map0);

        /*Similarly....*/
        HashMap<String, String> map_new1 = new HashMap<>();
        ConcurrentHashMap<String, String> map_new2 = new ConcurrentHashMap<>(map_new1);



        //TreeMap
        Map<String, String> map2 = new TreeMap<>();
        ConcurrentHashMap<String, String> map3 = new ConcurrentHashMap<>(map2);

        /* Similarly.... */

        TreeMap<String, String> map22 = new TreeMap<>();
        ConcurrentHashMap<String, String> map33 = new ConcurrentHashMap<>(map22);

        //LinkedHashMap

        
        Map<String, String> map4 = new LinkedHashMap<>();
        ConcurrentHashMap<String, String> map5 = new ConcurrentHashMap<>(map4);

        /* Similarly.... */
        LinkedHashMap<String, String> map44 = new LinkedHashMap<>();
        ConcurrentHashMap<String, String> map55 = new ConcurrentHashMap<>(map44);

        //WeakHashMap
        Map<String, String> map6 = new WeakHashMap<>();
        ConcurrentHashMap<String, String> map7 = new ConcurrentHashMap<>(map6);

        /* Similarly.... */
        WeakHashMap<String, String> map66 = new WeakHashMap<>();
        ConcurrentHashMap<String, String> map77 = new ConcurrentHashMap<>(map66);

        //IdentityHashMap
        IdentityHashMap<String, String> map8 = new IdentityHashMap<>();
        ConcurrentHashMap<String, String> map9 = new ConcurrentHashMap<>(map8);

        /* Similarly.... */
        IdentityHashMap<String, String> map88 = new IdentityHashMap<>();
        ConcurrentHashMap<String, String> map99 = new ConcurrentHashMap<>(map88);

       


        map1.put("1", "one");
        map1.put("2", "two");
        map1.put("3", "three");
        map1.put("4", "four");
        map1.put("5", "five");
        map1.put("6", "six");
        map1.put("7", "seven");
        map1.put("8", "eight");

        System.out.println("Map:" + map1);

        map_new.putAll(map1);
        System.out.println("Map_new:" + map_new);

        
    }
    
}
